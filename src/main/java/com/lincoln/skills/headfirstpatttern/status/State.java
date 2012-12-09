package com.lincoln.skills.headfirstpatttern.status;


/**
 * �������ж��� ÿ��״̬����ʵ�ֶ����ڸ�״̬�£�ִ�ж���ʱ���������
 * 
 * �޸�Ϊ�����࣬ע��㣺 ��ϸ����ÿ��������Ĭ����Ϊ��ʲô��
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
	 * Ͷ��
	 */
	public void insertQuarter() {
		System.out.println("you have inserted a quarter.");
	}

	/**
	 * �˱�
	 */
	public void ejectQuarter() {
		System.out.println("you have not inserted a quarter yet.");
	}

	/**
	 * ת������
	 * 
	 * @return �Ƿ�Ҫ�³��ǹ�
	 */
	public boolean turnCrank() {
		return false;
	}

	/**
	 * �³��ǹ�
	 */
	public void dispense() {
		machine.releaseBall();
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

}
