package com.study.state;

public class Butterfly {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void walk() {
		state.walkHandle();
	}

	public void fly() {
		state.flyHandle();
	}

	public void eat() {
		state.eatHandle();
	}
}
