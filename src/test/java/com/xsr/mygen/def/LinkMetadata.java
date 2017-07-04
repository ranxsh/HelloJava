package com.xsr.mygen.def;

public class LinkMetadata {

	private ColumnMetadata from;
	private ColumnMetadata to;

	public LinkMetadata(ColumnMetadata from, ColumnMetadata to) {

		this.from = from;
		this.to = to;
	}

	public ColumnMetadata getFrom() {
		return from;
	}

	public ColumnMetadata getTo() {
		return to;
	}

}
