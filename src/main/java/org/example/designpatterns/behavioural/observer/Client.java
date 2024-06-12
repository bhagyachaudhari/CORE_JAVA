package org.example.designpatterns.behavioural.observer;

public class Client {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new TVDisplay());
        weatherStation.addObserver(new PhoneDisplay());
        weatherStation.setWeather("Raining");
        weatherStation.notifyObserver();
    }
}
