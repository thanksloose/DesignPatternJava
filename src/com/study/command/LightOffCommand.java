package com.study.command;

public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}

	@Override
	public void unDo() {
		light.turnOn();
	}

}
