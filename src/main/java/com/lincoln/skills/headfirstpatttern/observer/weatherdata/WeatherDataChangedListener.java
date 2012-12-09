package com.lincoln.skills.headfirstpatttern.observer.weatherdata;


/**
 * 天气数据监听器
 * 
 * @author lincoln
 * 
 */
public interface WeatherDataChangedListener {

	public void listen(double temperature, double humidity, double pressure);

}
