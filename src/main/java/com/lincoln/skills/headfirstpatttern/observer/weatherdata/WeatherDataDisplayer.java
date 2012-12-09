package com.lincoln.skills.headfirstpatttern.observer.weatherdata;

public class WeatherDataDisplayer implements WeatherDataChangedHandler {

	public void changed(MyWeatherData weatherData) {
		refresh(weatherData);

	}

	public void refresh(MyWeatherData weatherData) {
		System.out.println("Displayer:refresh weather data:" + weatherData);
	}

}
