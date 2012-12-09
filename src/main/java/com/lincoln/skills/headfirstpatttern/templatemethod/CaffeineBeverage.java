package com.lincoln.skills.headfirstpatttern.templatemethod;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	private void pourInCup() {
		System.out.println("pouring in cup.");
	}

	private void boilWater() {
		System.out.println("boiling water.");
	}

	abstract void brew();

	abstract void addCondiments();

}
