package com.lincoln.skills.headfirstpatttern.status;

import java.util.Random;

public class HasQuarterState extends State {

	public HasQuarterState(SuperSugarMachine machine) {
		super(machine);
	}

	public void ejectQuarter() {
		machine.setState(machine.getNoQuarterState());
		System.out.println("a quarter ejected.");
	}

	public boolean turnCrank() {

		System.out.println("you just trun crank.");

		Random randomWinner = new Random(System.currentTimeMillis());
		int winner = randomWinner.nextInt(10);
		if (winner == 0 && (machine.getSize() > 1)) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
		return true;
	}

}
