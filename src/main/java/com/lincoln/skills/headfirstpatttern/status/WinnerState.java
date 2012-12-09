package com.lincoln.skills.headfirstpatttern.status;

public class WinnerState extends State {

	public WinnerState(SuperSugarMachine machine) {
		super(machine);
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
