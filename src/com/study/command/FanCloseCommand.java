package com.study.command;

public class FanCloseCommand implements Command {

	private Fan fan;

	public FanCloseCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.close();
	}

	@Override
	public void unDo() {
		fan.open();
	}

}
