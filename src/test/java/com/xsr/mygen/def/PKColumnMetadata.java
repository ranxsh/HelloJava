package com.xsr.mygen.def;

public class PKColumnMetadata extends ColumnMetadata {

	public static PKColumnMetadata from(ColumnMetadata from) {
		PKColumnMetadata result = new PKColumnMetadata();
		result.setTableCat(from.getTableCat());
		result.setTableSchema(from.getTableSchema());
		result.setTableName(from.getTableName());
		result.setColumnName(from.getColumnName());
		result.setDataType(from.getDataType());
		result.setTypeName(from.getTypeName());
		result.setColumnSize(from.getColumnSize());
		result.setDecimalDigits(from.getDecimalDigits());
		result.setNumPrecRadix(from.getNumPrecRadix());
		result.setNullable(from.getNullable());
		result.setRemarks(from.getRemarks());
		result.setColumnDef(from.getColumnDef());
		result.setCharOctetLength(from.getCharOctetLength());
		result.setOrdinalPosition(from.getOrdinalPosition());
		result.setIsNullable(from.getIsNullable());
		result.setScopeCatalog(from.getScopeCatalog());
		result.setScopeSchema(from.getScopeSchema());
		result.setScopeTable(from.getScopeTable());
		result.setSourceDataType(from.getSourceDataType());
		result.setIsAutoincrement(from.getIsAutoincrement());
		return result;
	}

}
