package org.example.designpatterns.behavioural.strategy;

public class BikePathCalculator implements IPathCalculatorStrategy{


    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Bike Path");
    }
}
