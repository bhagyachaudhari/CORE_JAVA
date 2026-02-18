package my.practice.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }

}
