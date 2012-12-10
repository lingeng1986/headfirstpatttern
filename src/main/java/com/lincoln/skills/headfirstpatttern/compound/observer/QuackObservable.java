package com.lincoln.skills.headfirstpatttern.compound.observer;

/**
 * �����ɹ۲��
 * 
 * @author lincoln
 * 
 */
public interface QuackObservable {

	public void registerObserver(Observer observer);

	public void notifyObservers();
}
