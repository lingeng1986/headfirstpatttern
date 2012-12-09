package com.lincoln.skills.headfirstpatttern.observer.weatherdata;

public class WeatherData {

	private WeatherDataChangedListener listener;

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
		listener.listen(getTemperature(), getHumidity(), getPressure());
	}

	/**
	 * @param listener
	 *            the listener to set
	 */
	public void setListener(WeatherDataChangedListener listener) {
		this.listener = listener;
	}

}
