package com.lincoln.skills.headfirstpatttern.command;

public class NoCommand implements Command {

	public void execute() {
		System.out.println("do nothing.");
	}

	public void undo() {
		System.out.println("undo nothing.");
	}

}
