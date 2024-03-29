package com.lincoln.skills.headfirstpatttern.decorate.starbuzz;

public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Soy";
	}

	@Override
	public double cost() {
		return 0.3 + beverage.cost();
	}

}
