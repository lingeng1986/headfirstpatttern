package com.lincoln.skills.headfirstpatttern.status;

/**
 * �������ж���
 * 
 * ÿ��״̬������ʵ�ֻ�������״̬�£�ִ�ж���ʱ���������
 * 
 * @author lincoln
 * 
 */
public interface State {

	/**
	 * Ͷ��
	 */
	public void insertQuarter();

	/**
	 * �˱�
	 */
	public void ejectQuarter();

	/**
	 * ת������
	 */
	public void turnCrank();

	/**
	 * �³��ǹ�
	 */
	public void dispense();

}
