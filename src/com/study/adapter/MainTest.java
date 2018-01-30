package com.study.adapter;

public class MainTest {
	public static void main(String[] args) {
		NewSystem newSystem = new NewSystem(); 
		OldSystem oldSystem = new OldSystem(); 
		oldSystem.processData(new ListEnumAdapter(newSystem.generateData()));
	}
}
