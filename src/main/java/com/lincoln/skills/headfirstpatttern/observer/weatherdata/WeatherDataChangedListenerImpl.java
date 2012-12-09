package com.lincoln.skills.headfirstpatttern.observer.weatherdata;

import java.util.List;

public class WeatherDataChangedListenerImpl implements
		WeatherDataChangedListener {

	private List<WeatherDataChangedHandler> handlers;

	public void listen(double temperature, double humidity, double pressure) {
		final MyWeatherData weatherData = new MyWeatherData();
		weatherData.setHumidity(humidity);
		weatherData.setPressure(pressure);
		weatherData.setTemperature(temperature);

		for (final WeatherDataChangedHandler handler : handlers) {
			((new Runnable() {

				public void run() {

					handler.changed(weatherData);
				}
			})).run();
		}
	}

	/**
	 * @param handlers
	 *            the handlers to set
	 */
	public void setHandlers(List<WeatherDataChangedHandler> handlers) {
		this.handlers = handlers;
	}

}
