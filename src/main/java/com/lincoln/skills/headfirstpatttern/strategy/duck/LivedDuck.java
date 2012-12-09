package com.lincoln.skills.headfirstpatttern.strategy.duck;

import java.awt.Color;

public class LivedDuck extends Duck {

	public LivedDuck() {
		this.setFlyBehavior(new LivedDuckFlyBehavior());
		this.setQuackBehavior(new LivedDuckQuackBehavior());
	}

	@Override
	public String getColor() {

		return Color.YELLOW.toString();
	}

}
