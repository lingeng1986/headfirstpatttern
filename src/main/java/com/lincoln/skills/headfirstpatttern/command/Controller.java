package com.lincoln.skills.headfirstpatttern.command;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	List<Command> onCommands;
	List<Command> offCommands;

	List<Command> executedCommands = new ArrayList<Command>();

	public Controller(int size) {
		onCommands = new ArrayList<Command>(size);
		offCommands = new ArrayList<Command>(size);
		for (int index = 0; index < size; index++) {
			onCommands.add(new NoCommand());
			offCommands.add(new NoCommand());
		}
	}

	public void setOnCommand(int index, Command command) {
		onCommands.set(index, command);
	}

	public void setOffCommand(int index, Command command) {
		offCommands.set(index, command);
	}

	public void onButtonPressed(int index) {
		onCommands.get(index).execute();
		executedCommands.add(onCommands.get(index));
	}

	public void offButtonPressed(int index) {
		offCommands.get(index).execute();
		executedCommands.add(offCommands.get(index));
	}

	public void undo() {
		if (executedCommands.isEmpty()) {
			return;
		}
		executedCommands.get(executedCommands.size() - 1).undo();
		executedCommands.remove(executedCommands.size() - 1);
	}
}
