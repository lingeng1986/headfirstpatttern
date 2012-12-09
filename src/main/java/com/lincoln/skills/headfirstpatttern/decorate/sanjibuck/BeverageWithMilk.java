package com.lincoln.skills.headfirstpatttern.decorate.sanjibuck;

public class BeverageWithMilk implements Beverage {

	private Beverage beverage;

	public BeverageWithMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String description() {
		return beverage.description() + " with milk.";
	}

	public double cost() {
		return beverage.cost() + 5;
	}

}
