package com.study.command;

public class MainTest {
	public static void main(String[] args) {
		Light light = new Light();
		Fan fan = new Fan();
		House house = new House();
		
		house.execute(new LightOnCommand(light));
		house.execute(new FanOpenCommand(fan));
		house.undo();
		house.redo();
	}
}
