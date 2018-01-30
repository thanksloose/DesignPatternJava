package com.study.bridge;

public class MainTest {
	public static void main(String[] args) {
		Net gsmNet = new GSMNet();
		Net cdmaNet = new CDMANet();
		Signal phoneSignal = new PhoneSignal();
		Signal textSignal = new TextSignal();

		gsmNet.setSignal(phoneSignal);
		gsmNet.send();
	}
}
