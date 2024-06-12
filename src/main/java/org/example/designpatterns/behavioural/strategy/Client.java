package org.example.designpatterns.behavioural.strategy;

public class Client {

    public static void main(String[] args) {
        IPathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculator("car");
        pathCalculatorStrategy.calculatePath("dadar", "malad");

        IPathCalculatorStrategy pathCalculatorStrategy1 = PathCalculatorFactory.getPathCalculator("walk");
        pathCalculatorStrategy1.calculatePath("dadar", "malad");

        IPathCalculatorStrategy pathCalculatorStrategy2 = PathCalculatorFactory.getPathCalculator("bike");
        pathCalculatorStrategy2.calculatePath("dadar", "malad");
    }
}
