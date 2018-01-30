package com.study.state;

public class GrubState extends State {
	// grub 幼虫
	@Override
	public void walkHandle() {
		System.out.println("grub can't walk");
	}

	@Override
	public void flyHandle() {
		System.out.println("grub can't fly");
	}

	@Override
	public void eatHandle() {
		System.out.println("grub can eat");
	}

}
