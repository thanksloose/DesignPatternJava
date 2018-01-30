package com.study.observer;

import java.util.ArrayList;
import java.util.List;

public class School implements Subject{

	List<Observer> observers = new ArrayList<>();
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObervers() {
		for(Observer o:observers) {
			o.update();
		}
	}

}
