package com.study.bridge;

public abstract class Net {
	private Signal signal;

	public Signal getSignal() {
		return signal;
	}

	public void setSignal(Signal signal) {
		this.signal = signal;
	}

	public void send() {
		signal.encode();
		//模板模式
		doSend();
	}

	public abstract void doSend();
}
