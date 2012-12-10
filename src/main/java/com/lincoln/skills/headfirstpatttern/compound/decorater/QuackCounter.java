package com.lincoln.skills.headfirstpatttern.compound.decorater;

import com.lincoln.skills.headfirstpatttern.compound.Quackable;
import com.lincoln.skills.headfirstpatttern.compound.observer.Observer;

/**
 * 装饰者模式：新增了统计鸭叫声次数的行为
 * 
 * @author lincoln
 * 
 */
public class QuackCounter implements Quackable {

	private Quackable duck;
	private static int quackCounts;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	public void quack() {
		duck.quack();
		quackCounts++;
	}

	public static int getQuacks() {
		return quackCounts;
	}

	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	public void notifyObservers() {
		duck.notifyObservers();
	}

}
