package com.lincoln.skills.headfirstpatttern.observer.weatherdata.jdktool;



/**
 * 测试使用jdk自带观察者模式工具
 * 
 * @author lincoln
 * 
 */
public class MainV2 {

	public static void main(String[] args) {
		WeatherDataV2 observable = new WeatherDataV2();
		WeatherDataDisplayerV2 displayerV2 = new WeatherDataDisplayerV2(
				observable);

		observable.measurementsChanged();
	}
}
