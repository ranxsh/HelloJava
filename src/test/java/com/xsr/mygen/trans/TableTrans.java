package com.xsr.mygen.trans;

import com.xsr.mygen.def.ColumnMetadata;
import com.xsr.mygen.def.LinkMetadata;
import com.xsr.mygen.def.TableMetadata;
import com.xsr.utils.IteratorableHashMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TableTrans extends Trans {

//	private static Map<String, TableTrans> map = new ConcurrentHashMap<String, TableTrans>();
	Map<String, TableMetadata> tableMetadataMap;
	private String alias;
	private TableMetadata meta;
	private List<LinkTrans> linkList;
	private List<LinkTrans> linkByList;
	private List<ColumnTrans> keyList;
	private List<ColumnTrans> columns;
	private ColumnTrans incColumn;

	public TableTrans(String tableName, Map<String, TableMetadata> tableMetadataMap) {
		this.meta = tableMetadataMap.get(tableName);
		this.alias = this.createTableAlias();
		this.tableMetadataMap = tableMetadataMap;
	}
//
//	public static TableTrans find(String tableName) {
//		TableTrans result = map.get(tableName);
//		if (result == null) {
//			TableMetadata meta = TableMetadata.find(tableName);
//			result = new TableTrans(meta);
//			map.put(meta.getTableName(), result);
//		}
//		return result;
//	}
//
//	public static TableTrans forceNew(String tableName) {
//		TableMetadata meta = TableMetadata.find(tableName);
//		return new TableTrans(meta);
//	}

	public String getUpperStartClassName() {
		return underscoreToCamelCase(meta.getTableName());
	}

	public String getLowerStartClassName() {
		String camelCase = underscoreToCamelCase(meta.getTableName());
		return camelCase.substring(0, 1).toLowerCase() + camelCase.substring(1);
	}

	public String getName() {
		return meta.getTableName();
	}

	public List<ColumnTrans> getKeys() {
		return keyList == null ? keyList = buildTrans(meta.getKeys()) : keyList;
	}

	public List<ColumnTrans> getColumns() {
		return columns == null ? columns = buildTrans(meta.getColumns()) : columns;
	}

	public List<LinkTrans> getLinks() {
		return linkList == null ? linkList = buildTrans(meta.getLinks()) : linkList;
	}

	public List<LinkTrans> getLinkBys() {
		return linkByList == null ? linkByList = buildTrans(meta.getLinkBys()) : linkByList;
	}

	public String getAlias() {
		return this.alias;
	}

	public ColumnTrans getIncColumn() {
		return incColumn == null ? incColumn = buildIncColumnTrans(meta) : incColumn;
	}

	public void setIncColumn(ColumnTrans incColumn) {
		this.incColumn = incColumn;
	}

	private List<LinkTrans> buildTrans(List<LinkMetadata> links) {
		List<LinkTrans> result = new ArrayList<LinkTrans>();
		for (LinkMetadata link : links)
			result.add(new LinkTrans(link, this));
		return result;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<ColumnTrans> buildTrans(IteratorableHashMap cols) {
		List<ColumnTrans> result = new ArrayList<ColumnTrans>();
		Map.Entry<String, ColumnMetadata> entry = null;
		Iterator<Map.Entry<String, ColumnMetadata>> it = cols.entrySet().iterator();
		while (it.hasNext()) {
			entry = it.next();
			result.add(new ColumnTrans(entry.getValue(), this));
		}
		return result;
	}

	private ColumnTrans buildIncColumnTrans(TableMetadata meta) {
		ColumnTrans result = null;
		if(meta.getIncColumnMetadata() != null){
			result = new ColumnTrans(meta.getIncColumnMetadata(),this);
		}
		return result;
	}
}
