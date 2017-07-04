package com.xsr.utils;

import java.sql.Types;

public class SqlTypeUtils {

	public static String decodeToJavaType(int type) {
		switch (type) {
		case Types.BIT:
			return "Integer";
		case Types.TINYINT:
			return "Integer";
		case Types.SMALLINT:
			return "Integer";
		case Types.INTEGER:
			return "Integer";
		case Types.BIGINT:
			return "Long";
		case Types.FLOAT:
			return "Double";
		case Types.REAL:
			return "Float";
		case Types.DOUBLE:
			return "Double";
		case Types.NUMERIC:
			return "Long";
		case Types.DECIMAL:
			return "BigDecimal";
		case Types.CHAR:
			return "String";
		case Types.VARCHAR:
			return "String";
		case Types.LONGVARCHAR:
			return "String";
		case Types.DATE:
			return "Date";
		case Types.TIME:
			return "Date";
		case Types.TIMESTAMP:
			return "Date";
		case Types.BINARY:
			return "Byte[]";
		case Types.VARBINARY:
			return "Byte[]";
		case Types.LONGVARBINARY:
			return "Byte[]";
		case Types.BLOB:
			return "Byte[]";
		case Types.CLOB:
			return "Byte[]";
		case Types.BOOLEAN:
			return "Boolean";
		default:
			throw new RuntimeException(String.format("类型不匹配[%s]", type));
		}
	}

	public static String decodeToName(int type) {
		switch (type) {
		case Types.BIT:
			return "BIT          ".trim();
		case Types.TINYINT:
			return "TINYINT      ".trim();
		case Types.SMALLINT:
			return "SMALLINT     ".trim();
		case Types.INTEGER:
			return "INTEGER      ".trim();
		case Types.BIGINT:
			return "BIGINT       ".trim();
		case Types.FLOAT:
			return "FLOAT        ".trim();
		case Types.REAL:
			return "REAL         ".trim();
		case Types.DOUBLE:
			return "DOUBLE       ".trim();
		case Types.NUMERIC:
			return "NUMERIC      ".trim();
		case Types.DECIMAL:
			return "DECIMAL      ".trim();
		case Types.CHAR:
			return "CHAR         ".trim();
		case Types.VARCHAR:
			return "VARCHAR      ".trim();
		case Types.LONGVARCHAR:
			return "LONGVARCHAR  ".trim();
		case Types.DATE:
			return "DATE         ".trim();
		case Types.TIME:
			return "TIME         ".trim();
		case Types.TIMESTAMP:
			return "TIMESTAMP    ".trim();
		case Types.BINARY:
			return "BINARY       ".trim();
		case Types.VARBINARY:
			return "VARBINARY    ".trim();
		case Types.LONGVARBINARY:
			return "LONGVARBINARY".trim();
		case Types.NULL:
			return "NULL         ".trim();
		case Types.OTHER:
			return "OTHER        ".trim();
		case Types.JAVA_OBJECT:
			return "JAVA_OBJECT  ".trim();
		case Types.DISTINCT:
			return "DISTINCT     ".trim();
		case Types.STRUCT:
			return "STRUCT       ".trim();
		case Types.ARRAY:
			return "ARRAY        ".trim();
		case Types.BLOB:
			return "BLOB         ".trim();
		case Types.CLOB:
			return "CLOB         ".trim();
		case Types.REF:
			return "REF          ".trim();
		case Types.DATALINK:
			return "DATALINK     ".trim();
		case Types.BOOLEAN:
			return "BOOLEAN      ".trim();
		case Types.ROWID:
			return "ROWID        ".trim();
		case Types.NCHAR:
			return "NCHAR        ".trim();
		case Types.NVARCHAR:
			return "NVARCHAR     ".trim();
		case Types.LONGNVARCHAR:
			return "LONGNVARCHAR ".trim();
		case Types.NCLOB:
			return "NCLOB        ".trim();
		case Types.SQLXML:
			return "SQLXML       ".trim();
		default:
			throw new RuntimeException(String.format("δ֪����������[%s]", type));
		}
	}

}
