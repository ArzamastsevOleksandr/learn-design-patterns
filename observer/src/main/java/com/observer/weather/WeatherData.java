package com.observer.weather;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private double temp;
    private double humidity;
    private double pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public double getTemp() {
        return temp;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public double getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        log.debug("Measurements changed: t: {}, h: {}, p: {}", temp, humidity, pressure);
        measurementsChanged();
    }

}
