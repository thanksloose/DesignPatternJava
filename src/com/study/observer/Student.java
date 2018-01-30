package com.study.observer;

public class Student implements Observer{

	@Override
	public void update() {
		System.out.println("student receive a message");
	}

}
