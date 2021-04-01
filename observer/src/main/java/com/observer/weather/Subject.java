package com.observer.weather;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    double getTemp();
    double getHumidity();
    double getPressure();

}
