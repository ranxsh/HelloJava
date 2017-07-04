package com.xsr.mygen.trans;

import com.xsr.mygen.def.LinkMetadata;

public class LinkTrans extends Trans {

	private ColumnTrans from;
	private ColumnTrans to;

	public LinkTrans(ColumnTrans from, ColumnTrans to) {
		this.from = from;
		this.to = to;
		if (this.from.getTableTrans() == this.to.getTableTrans()) {
			this.from.setTableTrans(from.getTableTrans());
			this.to.setTableTrans(to.getTableTrans());
		}
	}

	public LinkTrans(LinkMetadata link, TableTrans tableTrans) {
		this(new ColumnTrans(link.getFrom(), tableTrans), new ColumnTrans(link.getTo(), tableTrans));
	}

	public TableTrans getTargetTableTrans() {
		return to.getTableTrans();
	}

	public TableTrans getFromTableTrans() {
		return from.getTableTrans();
	}

	public String getFromColumnName() {
		return from.getName();
	}

	public String getToColumnName() {
		return to.getName();
	}
}
