package com.lincoln.skills.headfirstpatttern.strategy.duck;

import com.lincoln.skills.headfirstpatttern.strategy.duck.behavior.FlyBehavior;

public class RocketFlyBehavior implements FlyBehavior {

	public String fly() {
		return "i'm flying with rocket!";
	}

}
