package com.study.decorator;

import java.util.ArrayList;

public class ArrayListDecorator extends ArrayList<String> {
	private ArrayList<String> list;

	public ArrayListDecorator(ArrayList<String> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean add(String e) {
		System.out.println("before add");
		return list.add(e);
	}
}
