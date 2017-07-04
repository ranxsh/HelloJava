package com.xsr.mygen.trans;

import com.xsr.mygen.def.ColumnMetadata;
import com.xsr.utils.SqlTypeUtils;

public class ColumnTrans extends Trans {

	private String alias;
	private ColumnMetadata meta;
	private TableTrans trans;

	public ColumnTrans(ColumnMetadata meta, TableTrans tableTrans) {
		this.meta = meta;
		this.alias = this.createColumnAlias();
		this.trans = tableTrans;
	}

	public String getUpperStartFieldName() {
		return underscoreToCamelCase(meta.getColumnName());
	}

	public String getLowerStartFieldName() {
		String camelCase = underscoreToCamelCase(meta.getColumnName());
		return camelCase.substring(0, 1).toLowerCase() + camelCase.substring(1);
	}

	public TableTrans getTableTrans() {
		return trans;
	}

	public void setTableTrans(TableTrans trans) {
		this.trans = trans;
	}

	public String getJdbcType() {
		return meta.getTypeName();
	}

	public String getRemarks() {
		return meta.getRemarks();
	}

	public String getJavaType() {
		return SqlTypeUtils.decodeToJavaType(meta.getDataType());
	}

	public String getName() {
		return meta.getColumnName();
	}

	public String getTableName() {
		return meta.getTableName();
	}

	public String getAlias() {
		return alias;
	}

}
