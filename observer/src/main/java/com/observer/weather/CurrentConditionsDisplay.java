package com.observer.weather;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private double temp;
    private double humidity;
    private double pressure;
    private final Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
        this.subject = subject;
    }

    @Override
    public void display() {
        log.debug("Temp: {}, Humidity: {}, Pressure: {}", temp, humidity, pressure);
    }

    @Override
    public void update() {
        this.temp = subject.getTemp();
        this.humidity = subject.getHumidity();
        this.pressure = subject.getPressure();
        display();
    }

}
