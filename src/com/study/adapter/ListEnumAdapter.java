package com.study.adapter;

import java.util.Enumeration;
import java.util.List;

public class ListEnumAdapter implements Enumeration<String> {

	private List<String> list;
	private int pos;

	public ListEnumAdapter(List<String> list) {
		super();
		this.list = list;
	}
	
	@Override
	public boolean hasMoreElements() {
		if (null == list || list.isEmpty()) {
			return false;
		}
		return pos < list.size();
	}

	@Override
	public String nextElement() {
		return list.get(pos++);
	}
}
