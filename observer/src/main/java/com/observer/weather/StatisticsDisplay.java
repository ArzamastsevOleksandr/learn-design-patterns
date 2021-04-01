package com.observer.weather;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StatisticsDisplay implements DisplayElement, Observer {

    private final List<Double> temps = new ArrayList<>();
    private final List<Double> humidities = new ArrayList<>();
    private final List<Double> pressures = new ArrayList<>();
    private final Subject subject;

    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
        this.subject = subject;
    }

    @Override
    public void display() {
        Double avgTemp = getAvgValue(temps);
        Double avgHumidity = getAvgValue(humidities);
        Double avgPressure = getAvgValue(pressures);
        log.debug("Avg Temp: {}, Avg Humidity: {}, Avg Pressure: {}", avgTemp, avgHumidity, avgPressure);
    }

    private double getAvgValue(List<Double> values) {
        return values.stream()
                .reduce(Double::sum)
                .orElse(0.0) / values.size();
    }

    @Override
    public void update() {
        temps.add(subject.getTemp());
        humidities.add(subject.getHumidity());
        pressures.add(subject.getPressure());
        display();
    }

}
