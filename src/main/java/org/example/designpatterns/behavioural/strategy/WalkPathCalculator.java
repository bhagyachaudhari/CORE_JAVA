package org.example.designpatterns.behavioural.strategy;

public class WalkPathCalculator implements IPathCalculatorStrategy{


    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Walk Path");
    }
}
