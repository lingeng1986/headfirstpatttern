package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.observer.Observable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

/*
 * ÏðÆ¤Ñ¼
 */
public class RubberDuck implements Quackable {

	private Observable observable;

	public RubberDuck() {
		this.observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Squeak.");
		observable.notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

}
