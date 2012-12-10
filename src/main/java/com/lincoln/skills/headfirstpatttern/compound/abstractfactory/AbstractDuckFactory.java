package com.lincoln.skills.headfirstpatttern.compound.abstractfactory;

import com.lincoln.skills.headfirstpatttern.compound.Quackable;

/**
 * ����Ѽ�ӵĳ��󹤳�
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
