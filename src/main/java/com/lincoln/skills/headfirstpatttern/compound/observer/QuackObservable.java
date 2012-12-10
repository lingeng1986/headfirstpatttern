package com.lincoln.skills.headfirstpatttern.compound.observer;

/**
 * ½ÐÉù¿É¹Û²ìµÄ
 * 
 * @author lincoln
 * 
 */
public interface QuackObservable {

	public void registerObserver(Observer observer);

	public void notifyObservers();
}
