package com.study.command;

import java.util.Vector;

public class House {
	private Vector<Command> undoList = new Vector<>();
	private Vector<Command> redoList = new Vector<>();
	
	public void execute(Command command) {
		command.execute();
		undoList.add(command);
	}
	
	public void undo() {
		Command command = undoList.lastElement();
		command.unDo();
		redoList.add(command);
		undoList.remove(command);
	}
	
	public void redo() {
		Command command = redoList.lastElement();
		command.execute();
		undoList.add(command);
		redoList.remove(command);
	}
}
