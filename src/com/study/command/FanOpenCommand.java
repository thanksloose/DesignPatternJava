package com.study.command;

public class FanOpenCommand implements Command {

	private Fan fan;

	public FanOpenCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.open();
	}

	@Override
	public void unDo() {
		fan.close();
	}

}
