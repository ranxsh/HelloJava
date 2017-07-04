package com.xsr.utils;

import java.util.HashMap;
import java.util.Iterator;

public class IteratorableHashMap<P, K> extends HashMap<P, K> implements Iterable<K> {

	private static final long serialVersionUID = -6455828927352156885L;

	public Iterator<K> iterator() {
		return this.values().iterator();
	}

}
