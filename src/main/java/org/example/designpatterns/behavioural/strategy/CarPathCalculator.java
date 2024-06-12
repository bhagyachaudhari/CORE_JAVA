package org.example.designpatterns.behavioural.strategy;

public class CarPathCalculator implements IPathCalculatorStrategy{


    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Car Path");
    }
}
