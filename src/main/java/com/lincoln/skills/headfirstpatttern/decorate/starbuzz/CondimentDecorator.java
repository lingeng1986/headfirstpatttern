package com.lincoln.skills.headfirstpatttern.decorate.starbuzz;

/**
 * 调料抽象类
 * 
 * @author lincoln
 * 
 */
public abstract class CondimentDecorator extends Beverage {

	/**
	 * 所有调料必须实现getDescription()
	 */
	public abstract String getDescription();
}
