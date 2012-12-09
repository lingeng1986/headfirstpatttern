package com.lincoln.skills.headfirstpatttern.observer.weatherdata.jdktool;

import java.util.Observable;
import java.util.Observer;

public class WeatherDataDisplayerV2 implements Observer {

	Observable observable;

	public WeatherDataDisplayerV2(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherDataV2) {
			display(o);
		}

	}

	private void display(Observable o) {
		System.out.println("DisplayerV2:weather data:" + o);
	}

}
