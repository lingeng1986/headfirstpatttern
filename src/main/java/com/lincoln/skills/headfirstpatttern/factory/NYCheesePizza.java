package com.lincoln.skills.headfirstpatttern.factory;

public class NYCheesePizza extends Pizza {

	public NYCheesePizza() {
		this.name = this.getClass().getSimpleName();
	}
}
