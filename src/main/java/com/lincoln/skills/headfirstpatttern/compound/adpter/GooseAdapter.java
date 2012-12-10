package com.lincoln.skills.headfirstpatttern.compound.adpter;

import com.lincoln.skills.headfirstpatttern.compound.Quackable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

public class GooseAdapter implements Quackable {

	private Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	public void quack() {
		goose.honk();
	}

	public void registerObserver(Observer observer) {
		throw new UnsupportedOperationException();
	}

	public void notifyObservers() {
		throw new UnsupportedOperationException();
	}

}
