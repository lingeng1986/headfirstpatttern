package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.observer.Observable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

/**
 * ÂÌÍ·Ñ¼
 * 
 * @author lincoln
 * 
 */
public class MallardDuck implements Quackable {
	private Observable observable;

	public MallardDuck() {
		this.observable = new Observable(this);
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
