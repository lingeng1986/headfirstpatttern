package com.lincoln.skills.headfirstpatttern.compound.compositeanditerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.lincoln.skills.headfirstpatttern.compound.Quackable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

/**
 * 鸭群
 * 
 * @author lincoln
 * 
 */
public class Flock implements Quackable {

	private List<Quackable> ducks = new ArrayList<Quackable>();

	public void add(Quackable duck) {
		ducks.add(duck);
	}

	public void quack() {
		java.util.Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.quack();
		}

	}

	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.registerObserver(observer);
		}
	}

	/** Quackable 在 quack的时候会通知观察者 ，所以这里不需要执行任何动作 */
	public void notifyObservers() {
	}

}
