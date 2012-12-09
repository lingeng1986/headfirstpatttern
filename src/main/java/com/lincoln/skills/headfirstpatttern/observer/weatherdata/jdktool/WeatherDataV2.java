package com.lincoln.skills.headfirstpatttern.observer.weatherdata.jdktool;

import java.util.Observable;

/**
 * ʹ��jdk�Դ���Observable����ʵ�ֹ۲���ģʽ
 * 
 * @author lincoln
 * 
 */
public class WeatherDataV2 extends Observable {

	public double getTemperature() {
		return Math.random() % 37;
	};

	public double getHumidity() {
		return Math.random() % 37;
	};

	public double getPressure() {
		return Math.random() % 37;
	};

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

}
