package com.lincoln.skills.headfirstpatttern.decorate.starbuzz;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
