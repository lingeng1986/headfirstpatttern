package com.lincoln.skills.headfirstpatttern.compound;

import com.lincoln.skills.headfirstpatttern.compound.observer.QuackObservable;

/**
 * 可发出叫声的
 * 
 * @author lincoln
 * 
 */
public interface Quackable extends QuackObservable {

	/**
	 * 叫
	 */
	public void quack();
}
