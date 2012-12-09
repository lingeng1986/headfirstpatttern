package com.lincoln.skills.headfirstpatttern.status;

public class EmptyState implements State {

	public void insertQuarter() {
		System.out.println("no sugar right now.");
	}

	public void ejectQuarter() {
		System.out.println("no quarter inserted.");
	}

	public void turnCrank() {
		System.out.println("no sugar right now.");
	}

	public void dispense() {
		System.out.println("no sugar right now.");
	}

}
