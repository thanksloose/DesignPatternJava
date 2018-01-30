package com.study.state;

public class MainTest {
	public static void main(String[] args) {
		State grub = new GrubState();
		State imago = new ImagoState();
		Butterfly butterfly = new Butterfly();
		butterfly.setState(grub);
		butterfly.eat();
		butterfly.setState(imago);
		butterfly.fly();
	}
}
