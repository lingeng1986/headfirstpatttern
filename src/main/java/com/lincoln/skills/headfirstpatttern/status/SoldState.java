package com.lincoln.skills.headfirstpatttern.status;

public class SoldState implements State {

	private SuperSugarMachine machine;

	public SoldState(SuperSugarMachine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("you have inserted a quarter.");
	}

	public void ejectQuarter() {
		System.out.println("sorry you already turned the crank.");
	}

	public void turnCrank() {
		System.out.println("turning twice doesn't get you another gumball.");
	}

	public void dispense() {
		machine.releaseBall();
		if (machine.getSize() > 0) {
			machine.setState(machine.getNoQuarterState());
		} else {

			machine.setState(machine.getEmptyState());
		}
	}

}
