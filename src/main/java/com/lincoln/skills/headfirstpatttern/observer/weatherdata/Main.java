package com.lincoln.skills.headfirstpatttern.observer.weatherdata;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<WeatherDataChangedHandler> handlers;

	private static WeatherDataChangedListenerImpl listener;

	private static WeatherData weatherData;

	static {
		initHandlers();

		initListener();

		initWeatherData();

	}

	public static void main(String[] args) {
		weatherData.measurementsChanged();

	}

	/**
	 * 
	 */
	private static void initWeatherData() {
		weatherData = new WeatherData();
		weatherData.setListener(listener);
	}

	/**
	 * 
	 */
	private static void initListener() {
		listener = new WeatherDataChangedListenerImpl();
		listener.setHandlers(handlers);
	}

	/**
	 * 
	 */
	private static void initHandlers() {
		handlers = new ArrayList<WeatherDataChangedHandler>();

		WeatherDataChangedHandler displayer = new WeatherDataDisplayer();
		handlers.add(displayer);
	}

}
