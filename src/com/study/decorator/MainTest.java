package com.study.decorator;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayListDecorator decoratorTest = new ArrayListDecorator(list);
		decoratorTest.add("a");
	}
}
