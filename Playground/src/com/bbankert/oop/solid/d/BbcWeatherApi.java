package com.bbankert.oop.solid.d;

public class BbcWeatherApi implements WeatherSource {

	@Override
	public double getTemperatureCelsius() {
		// TODO Auto-generated method stub
		return toCelsius(getTemperatureFarenheit());
	}
	
	private double getTemperatureFarenheit() {
		return 0;
	}
	
	private double toCelsius(double temperatureFarenheit) {
		return (temperatureFarenheit - 32) / 1.8f;
	}

}
