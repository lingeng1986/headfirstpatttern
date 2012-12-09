package com.lincoln.skills.headfirstpatttern.templatemethod.hook;

public abstract class CaffeineBeverageWithHook {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	protected boolean customerWantsCondiments() {
		return true;
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
