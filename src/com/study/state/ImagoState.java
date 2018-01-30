package com.study.state;

public class ImagoState extends State {
	// imago 成虫
	@Override
	public void walkHandle() {
		System.out.println("imago can walk");
	}

	@Override
	public void flyHandle() {
		System.out.println("imago can fly");
		
	}

	@Override
	public void eatHandle() {
		System.out.println("imago can eat");
		
	}
}
