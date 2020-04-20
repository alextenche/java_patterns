package model;

public class CurrentConditionsDisplay implements ObserverW, DisplayElement{

    private float temperature;
    private float windSpeed;
    private SubjectW weatherData;

    public CurrentConditionsDisplay(SubjectW weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + windSpeed + "% windspeed");
    }

    public void update(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        display();
    }
}
