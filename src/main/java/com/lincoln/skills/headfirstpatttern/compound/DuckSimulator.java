package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.abstractfactory.AbstractDuckFactory;
import com.lincoln.skills.headfirstpatttern.compound.abstractfactory.CountingDuckFactory;
import com.lincoln.skills.headfirstpatttern.compound.adpter.Goose;
import com.lincoln.skills.headfirstpatttern.compound.adpter.GooseAdapter;
import com.lincoln.skills.headfirstpatttern.compound.compositeanditerator.Flock;
import com.lincoln.skills.headfirstpatttern.compound.decorater.QuackCounter;
import com.lincoln.skills.headfirstpatttern.compound.observer.Quackologist;

public class DuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory counterFactory = new CountingDuckFactory();
		simulator.simulate(counterFactory);
	}

	private void simulate(AbstractDuckFactory counterFactory) {
		Quackable mallardDuck = counterFactory.createMallardDuck();
		Quackable redHeadDuck = counterFactory.createRedHeadDuck();
		Quackable duckCall = counterFactory.createDuckCall();
		Quackable rubberDuck = counterFactory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose());

		Flock ducks = new Flock();
		ducks.add(mallardDuck);
		ducks.add(redHeadDuck);
		ducks.add(duckCall);
		ducks.add(rubberDuck);

		Flock lotsOfMallardDucks = getLotsOfMallardDucks(counterFactory);

		ducks.add(lotsOfMallardDucks);

		System.out.println("Duck Simulator:");

		simulate(ducks);

		simulate(goose);

		System.out.println(QuackCounter.getQuacks());

		Quackologist quackologist = new Quackologist();
		ducks.registerObserver(quackologist);
		simulate(ducks);
	}

	/**
	 * @param counterFactory
	 * @return
	 */
	private Flock getLotsOfMallardDucks(AbstractDuckFactory counterFactory) {
		Flock lotsOfMallardDucks = new Flock();
		lotsOfMallardDucks.add(counterFactory.createMallardDuck());
		lotsOfMallardDucks.add(counterFactory.createMallardDuck());
		lotsOfMallardDucks.add(counterFactory.createMallardDuck());
		lotsOfMallardDucks.add(counterFactory.createMallardDuck());
		return lotsOfMallardDucks;
	}

	private void simulate(Quackable quackable) {
		quackable.quack();
	}

}
