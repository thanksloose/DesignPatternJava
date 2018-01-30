package com.study.command;

public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}

	@Override
	public void unDo() {
		light.turnOff();
	}

}
