package com.lincoln.skills.headfirstpatttern.observer.weatherdata;


/**
 * �������ݼ�����
 * 
 * @author lincoln
 * 
 */
public interface WeatherDataChangedListener {

	public void listen(double temperature, double humidity, double pressure);

}
