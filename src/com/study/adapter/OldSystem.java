package com.study.adapter;

import java.util.Enumeration;

public class OldSystem {
	public void processData(Enumeration<String> enumeration) {
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
