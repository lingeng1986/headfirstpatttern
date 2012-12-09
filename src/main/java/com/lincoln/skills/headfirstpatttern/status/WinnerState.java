package com.lincoln.skills.headfirstpatttern.status;

public class WinnerState implements State {

	private SuperSugarMachine machine;

	public WinnerState(SuperSugarMachine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	public void dispense() {
		System.out.println("you're a winner for 2 gumballs!");

		machine.releaseBall();
		if (machine.getSize() <= 0) {
			machine.setState(machine.getEmptyState());
		} else {
			machine.releaseBall();
			if (machine.getSize() <= 0) {
				machine.setState(machine.getEmptyState());
			} else {
				machine.setState(machine.getNoQuarterState());
			}
		}
	}

}
