package com.study.observer;

public class Teacher implements Observer{

	@Override
	public void update() {
		System.out.println("teacher receive a message");
	}

}
