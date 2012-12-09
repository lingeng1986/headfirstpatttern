package com.lincoln.skills.headfirstpatttern.status;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuperSugarMachine machine = new SuperSugarMachine(10);

		System.out.println(machine);

		machine.insertQuarter();
		machine.turnCrank();

		System.out.println(machine);

		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();

		System.out.println(machine);

	}

}
