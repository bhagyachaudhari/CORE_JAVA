package org.example.designpatterns.behavioural.observer;

public class TVDisplay implements Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Weather is updated on TV : " + weather);
    }


}
