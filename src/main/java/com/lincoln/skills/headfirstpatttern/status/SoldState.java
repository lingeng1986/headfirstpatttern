package com.lincoln.skills.headfirstpatttern.status;

public class SoldState extends State {

	public SoldState(SuperSugarMachine machine) {
		super(machine);
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
