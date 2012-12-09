package com.lincoln.skills.headfirstpatttern.status;

import java.util.Random;

public class HasQuarterState implements State {

	private SuperSugarMachine machine;

	public HasQuarterState(SuperSugarMachine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("you have inserted a quarter.");
	}

	public void ejectQuarter() {
		machine.setState(machine.getNoQuarterState());
		System.out.println("a quarter ejected.");
	}

	public void turnCrank() {

		System.out.println("you truned crank.");
		Random randomWinner = new Random(System.currentTimeMillis());
		int winner = randomWinner.nextInt(10);
		if (winner == 0 && (machine.getSize() > 1)) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
	}

	public void dispense() {
		System.out.println("no sugar dispensed.");
	}

}
