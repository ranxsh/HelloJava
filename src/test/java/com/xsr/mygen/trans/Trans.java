package com.xsr.mygen.trans;

import com.xsr.utils.DBUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicInteger;

public class Trans {

	private static AtomicInteger tableSeq = new AtomicInteger();
	private static AtomicInteger columnSeq = new AtomicInteger();

	protected synchronized String createTableAlias() {
		return "T" + tableSeq.incrementAndGet();
	}

	protected String createColumnAlias() {
		return "C" + columnSeq.incrementAndGet();
	}

	protected String underscoreToCamelCase(String src) {
		if (StringUtils.isEmpty(src)) {
			return StringUtils.EMPTY;
		}
		src = src.toLowerCase();
		StringBuilder sb = new StringBuilder(src.length());
		boolean needUpper = true;
		AtomicInteger index=new AtomicInteger();
		for (char c : src.toCharArray()) {
			index.incrementAndGet();
			if (c == '_') {
				needUpper = true;
				for (String key : DBUtils.removePrefixChars) {
					if(key.equals(sb.toString().toLowerCase())){
						sb.delete(0, index.get());
					}
				}
			} else {
				sb.append(needUpper ? Character.toUpperCase(c) : c);
				needUpper = false;
			}
		}
		return sb.toString();
	}

}
