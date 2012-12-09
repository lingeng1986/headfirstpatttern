package com.lincoln.skills.headfirstpatttern.status;

public class NoQuarterState implements State {

	private SuperSugarMachine machine;

	public NoQuarterState(SuperSugarMachine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("you inserted a quarter.");
		machine.setState(machine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("you haven't inserted a quarter.");
	}

	public void turnCrank() {
		System.out.println("insert a quarter before turn crank.");
	}

	public void dispense() {
		System.out.println("insert a quarter.");
	}

}
