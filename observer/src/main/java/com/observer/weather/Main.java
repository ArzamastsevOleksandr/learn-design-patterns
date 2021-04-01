package com.observer.weather;

public class Main {

    public static void main(String[] args) {
        var weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(40, 50, 60);
    }

}
