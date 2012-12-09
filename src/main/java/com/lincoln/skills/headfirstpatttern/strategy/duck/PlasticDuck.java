package com.lincoln.skills.headfirstpatttern.strategy.duck;

import java.awt.Color;

public class PlasticDuck extends Duck {

	public PlasticDuck() {
		this.setFlyBehavior(new CannotFlyBehavior());
		this.setQuackBehavior(new PlasticDuckQuackBehavior());
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return Color.GREEN.toString();
	}

}
