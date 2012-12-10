package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.observer.Observable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

/**
 * ºìÍ·Ñ¼
 * 
 * @author lincoln
 * 
 */
public class RedHeadDuck implements Quackable {
	private Observable observable;

	public RedHeadDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Quack.");
		observable.notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

}
