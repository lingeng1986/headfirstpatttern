package com.lincoln.skills.headfirstpatttern.factory;

public class ChicagoCheesePizza extends Pizza {

	public ChicagoCheesePizza() {
		this.name = this.getClass().getSimpleName();
	}

	public void bake() {
		System.out.println("bake for 25 minutes.");
	}

}
