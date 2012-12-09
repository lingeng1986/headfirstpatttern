package com.lincoln.skills.headfirstpatttern.status;

/**
 * 定义所有动作
 * 
 * 每个状态机自行实现机器在其状态下，执行动作时具体的内容
 * 
 * @author lincoln
 * 
 */
public interface State {

	/**
	 * 投币
	 */
	public void insertQuarter();

	/**
	 * 退币
	 */
	public void ejectQuarter();

	/**
	 * 转动曲柄
	 */
	public void turnCrank();

	/**
	 * 吐出糖果
	 */
	public void dispense();

}
