package com.lincoln.skills.headfirstpatttern.factory;

public abstract class Pizza {

	String name;

	public void prepare() {
		System.out.println(name + " is preparing.");
	}

	public void bake() {
		System.out.println(name + " is baking.");
	}

	public void box() {
		System.out.println(name + " is boxxing.");
	}

	public String getName() {
		return name;
	}

}
