package com.lincoln.skills.headfirstpatttern.compound.abstractfactory;

import com.lincoln.skills.headfirstpatttern.compound.DuckCall;
import com.lincoln.skills.headfirstpatttern.compound.MallardDuck;
import com.lincoln.skills.headfirstpatttern.compound.Quackable;
import com.lincoln.skills.headfirstpatttern.compound.RedHeadDuck;
import com.lincoln.skills.headfirstpatttern.compound.RubberDuck;
import com.lincoln.skills.headfirstpatttern.compound.decorater.QuackCounter;

/**
 * 统计叫声次数的鸭子工厂
 * 
 * @author lincoln
 * 
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
