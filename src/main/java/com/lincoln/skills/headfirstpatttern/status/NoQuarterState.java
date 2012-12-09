package com.lincoln.skills.headfirstpatttern.status;

public class NoQuarterState extends State {

	public NoQuarterState(SuperSugarMachine machine) {
		super(machine);

	}

	public void insertQuarter() {
		System.out.println("you just insert a quarter.");
		machine.setState(machine.getHasQuarterState());
	}

	public void dispense() {
		System.out.println("insert a quarter.");
	}

}
