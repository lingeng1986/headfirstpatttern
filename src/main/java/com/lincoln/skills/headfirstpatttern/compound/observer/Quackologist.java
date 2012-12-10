package com.lincoln.skills.headfirstpatttern.compound.observer;

public class Quackologist implements Observer {

	public void update(QuackObservable duck) {
		System.out.println("Quackologist:" + duck.getClass().getSimpleName()
				+ " just quacked.");
	}
}
