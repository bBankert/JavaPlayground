package com.bbankert.oop.solid.d;

import java.util.Arrays;

public class WeatherAggregator {
	private WeatherSource[] weatherSources;
	
	public WeatherAggregator(WeatherSource[] weatherSources) {
		this.weatherSources = weatherSources;
	}
	
	public double getTemperature() {
		return Arrays.stream(weatherSources)
				.mapToDouble(WeatherSource::getTemperatureCelsius)
				.average()
				.getAsDouble();
	}
}
