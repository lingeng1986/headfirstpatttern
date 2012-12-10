package com.lincoln.skills.headfirstpatttern.compound.abstractfactory;

import com.lincoln.skills.headfirstpatttern.compound.DuckCall;
import com.lincoln.skills.headfirstpatttern.compound.MallardDuck;
import com.lincoln.skills.headfirstpatttern.compound.Quackable;
import com.lincoln.skills.headfirstpatttern.compound.RedHeadDuck;
import com.lincoln.skills.headfirstpatttern.compound.RubberDuck;

/**
 * 普通鸭子工厂
 * 
 * @author lincoln
 * 
 */
public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
