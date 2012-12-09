package com.lincoln.skills.headfirstpatttern.strategy.duck;

import com.lincoln.skills.headfirstpatttern.strategy.duck.behavior.FlyBehavior;

public class CannotFlyBehavior implements FlyBehavior {

	public String fly() {
		// TODO Auto-generated method stub
		return "i cannot fly.";
	}

}
