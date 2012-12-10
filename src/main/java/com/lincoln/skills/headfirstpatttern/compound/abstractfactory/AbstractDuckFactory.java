package com.lincoln.skills.headfirstpatttern.compound.abstractfactory;

import com.lincoln.skills.headfirstpatttern.compound.Quackable;

/**
 * 创建鸭子的抽象工厂
 * 
 * @author lincoln
 * 
 */
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();

	public abstract Quackable createRedHeadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();

}
