package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.observer.Observable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

/**
 * Ñ¼ÃùÆ÷
 * 
 * @author lincoln
 * 
 */
public class DuckCall implements Quackable {
	private Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Kwak.");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

}
