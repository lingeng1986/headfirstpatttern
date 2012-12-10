package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.observer.QuackObservable;

/**
 * �ɷ���������
 * 
 * @author lincoln
 * 
 */
public interface Quackable extends QuackObservable {

	/**
	 * ��
	 */
	public void quack();
}
