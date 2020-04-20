package model;

import java.util.ArrayList;

public class WeatherData implements SubjectW {

    private float temperature;
    private float windSpeed;
    private float pressure;
    private ArrayList<ObserverW> observers;

    public WeatherData() {
        observers =  new ArrayList<ObserverW>();
    }

    public void registerObserver(ObserverW observer) {
        System.out.println("add observer to the list");
        observers.add(observer);
    }

    public void removeObserver(ObserverW observer) {
        System.out.println("remove observer to the list");
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(ObserverW observer:observers){
            observer.update(temperature, windSpeed, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float windSpeed, float pressure){
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public float getPressure() {
        return pressure;
    }
}
