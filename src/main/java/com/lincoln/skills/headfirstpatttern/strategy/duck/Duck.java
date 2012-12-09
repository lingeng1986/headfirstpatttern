package com.lincoln.skills.headfirstpatttern.strategy.duck;

import com.lincoln.skills.headfirstpatttern.strategy.duck.behavior.FlyBehavior;
import com.lincoln.skills.headfirstpatttern.strategy.duck.behavior.QuackBehavior;

public abstract class Duck {

	private FlyBehavior flyBehavior;

	private QuackBehavior quackBehavior;

	public abstract String getColor();

	public String quack() {
		return quackBehavior.quack();
	};

	public String fly() {
		return flyBehavior.fly();
	};

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
