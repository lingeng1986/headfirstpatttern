package com.lincoln.skills.headfirstpatttern.status;


/**
 * 定义所有动作 每个状态自行实现对象在该状态下，执行动作时具体的内容
 * 
 * 修改为抽象类，注意点： 仔细考虑每个方法的默认行为是什么。
 * 
 * @author lincoln
 * 
 */
public abstract class State {

	protected SuperSugarMachine machine;

	public State(SuperSugarMachine machine) {
		this.machine = machine;
	}

	/**
	 * 投币
	 */
	public void insertQuarter() {
		System.out.println("you have inserted a quarter.");
	}

	/**
	 * 退币
	 */
	public void ejectQuarter() {
		System.out.println("you have not inserted a quarter yet.");
	}

	/**
	 * 转动曲柄
	 * 
	 * @return 是否要吐出糖果
	 */
	public boolean turnCrank() {
		return false;
	}

	/**
	 * 吐出糖果
	 */
	public void dispense() {
		machine.releaseBall();
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

}
