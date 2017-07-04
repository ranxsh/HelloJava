package com.xsr.utils;

import com.xsr.mygen.def.ColumnMetadata;
import com.xsr.mygen.def.LinkMetadata;
import com.xsr.mygen.def.PKColumnMetadata;
import com.xsr.mygen.def.TableMetadata;
import org.apache.log4j.Logger;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by xs on 2017/6/9.
 */
public class TableMetaUtil {


    public static final Logger log = Logger.getLogger(DBUtils.class);

    public static void loadMetadata(DatabaseMetaData dbmd, Map<String, TableMetadata> tableMetadataMap) {

        String[] types = { "TABLE" };
        ResultSet rs = null;
        try {
            rs = dbmd.getTables(null, null, null, types);
            while (rs.next()) {
                solveTable(rs, tableMetadataMap);
            }
            rs = dbmd.getColumns(null, null, null, null);
            while (rs.next()) {
                solveColumn(rs, tableMetadataMap);
            }
            for (TableMetadata table : tableMetadataMap.values()) {
                rs = dbmd.getPrimaryKeys(null, null, table.getTableName());
                while (rs.next()) {
                    solvePrimaryKey(rs, tableMetadataMap);
                }
//                rs = dbmd.getImportedKeys(null, null, table.getTableName());
//                while (rs.next()) {
//                    solveForeignKey(rs, tableMetadataMap);
//                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("获取表信息出错", e);
        }

    }

    private static void solveForeignKey(ResultSet rs, Map<String, TableMetadata> tableMetadataMap) throws SQLException {
        String targetTableName = rs.getString("PKTABLE_NAME");
        String targetColumnName = rs.getString("PKCOLUMN_NAME");
        String tableName = rs.getString("FKTABLE_NAME");
        String columnName = rs.getString("FKCOLUMN_NAME");

        TableMetadata tableMetadata = tableMetadataMap.get(tableName);

        ColumnMetadata fromColumn = tableMetadataMap.get(tableName).getColumn(columnName); // .find(tableName).getColumn(columnName);
        ColumnMetadata toColumn = tableMetadataMap.get(targetTableName).getColumn(targetColumnName);
        LinkMetadata link = new LinkMetadata(fromColumn, toColumn);
        tableMetadataMap.get(fromColumn.getTableName()).addLink(link);
        tableMetadataMap.get(toColumn.getTableName()).addLinkBy(link);
        log.info(String.format("  表【%s】中的列【%s】引用表【%s】的列【%s】", tableName, columnName, targetTableName, targetColumnName));
    }

    private static void solvePrimaryKey(ResultSet rs, Map<String, TableMetadata> tableMetadataMap) throws SQLException {
        String tableName = rs.getString("TABLE_NAME");
        String columnName = rs.getString("COLUMN_NAME");
        TableMetadata tableMetadata = tableMetadataMap.get(tableName);
        ColumnMetadata keyColumn = null;
        if(tableMetadata.getIncColumnMetadata() != null && columnName.equalsIgnoreCase(tableMetadata.getIncColumnMetadata().getColumnName())){
            keyColumn = tableMetadata.getIncColumnMetadata();
        }else{
            keyColumn = tableMetadata.getColumns().remove(columnName);
        }

        tableMetadata.getKeys().put(columnName, PKColumnMetadata.from(keyColumn));
        log.debug(String.format("  表【%s】中的【%s】列标记为主键", tableName, columnName));
    }

    private static void solveTable(ResultSet rs, Map<String, TableMetadata> tableMetadataMap) throws SQLException {
        TableMetadata table = new TableMetadata();
        table.setTableName(rs.getString("TABLE_NAME ".trim()));
        table.setTableCat(rs.getString("TABLE_CAT  ".trim()));
        table.setTableSchema(rs.getString("TABLE_SCHEM".trim()));
        table.setTableType(rs.getString("TABLE_TYPE ".trim()));
        table.setRemarks(rs.getString("REMARKS    ".trim()));
        tableMetadataMap.put(rs.getString("TABLE_NAME ".trim()) ,table);
        log.debug(String.format("  发现表【%s】", table.getTableName()));
    }

    private static void solveColumn(ResultSet rs, Map<String, TableMetadata> tableMetadataMap) throws SQLException {
        ColumnMetadata column = new ColumnMetadata();
        column.setTableCat(rs.getString("TABLE_CAT         ".trim()));
        column.setTableSchema(rs.getString("TABLE_SCHEM       ".trim()));
        column.setTableName(rs.getString("TABLE_NAME        ".trim()));
        column.setColumnName(rs.getString("COLUMN_NAME       ".trim()));
        column.setDataType(rs.getInt("DATA_TYPE         ".trim()));
        // column.setTypeName (rs.getString("TYPE_NAME         ".trim()));
        column.setTypeName(SqlTypeUtils.decodeToName(column.getDataType()));
        column.setColumnSize(rs.getInt("COLUMN_SIZE       ".trim()));
        column.setDecimalDigits(rs.getInt("DECIMAL_DIGITS    ".trim()));
        column.setNumPrecRadix(rs.getInt("NUM_PREC_RADIX    ".trim()));
        column.setNullable(rs.getInt("NULLABLE          ".trim()));
        column.setRemarks(rs.getString("REMARKS           ".trim()));
        column.setColumnDef(rs.getString("COLUMN_DEF        ".trim()));
        column.setCharOctetLength(rs.getInt("CHAR_OCTET_LENGTH ".trim()));
        column.setOrdinalPosition(rs.getInt("ORDINAL_POSITION  ".trim()));
        column.setIsNullable(rs.getString("IS_NULLABLE       ".trim()));
        column.setScopeCatalog(rs.getString("SCOPE_CATALOG     ".trim()));
        column.setScopeSchema(rs.getString("SCOPE_SCHEMA      ".trim()));
        column.setScopeTable(rs.getString("SCOPE_TABLE       ".trim()));
        column.setSourceDataType(rs.getShort("SOURCE_DATA_TYPE  ".trim()));
        column.setIsAutoincrement(rs.getString("IS_AUTOINCREMENT  ".trim()));
        TableMetadata targetTable = tableMetadataMap.get(column.getTableName());
        column.setTableMetadata(targetTable);
        if("YES".equalsIgnoreCase(column.getIsAutoincrement())){
            targetTable.setIncColumnMetadata(column);
            log.debug(String.format("  表【%s】发现列【%s】，列类型为【%s】 IS_AUTOINCREMENT", column.getTableName(), column.getColumnName(), column.getTypeName()));
        }else{
            targetTable.addColumn(column);
            log.debug(String.format("  表【%s】发现列【%s】，列类型为【%s】", column.getTableName(), column.getColumnName(), column.getTypeName()));
        }
    }

}
