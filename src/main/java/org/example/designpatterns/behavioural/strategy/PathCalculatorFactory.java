package org.example.designpatterns.behavioural.strategy;

public class PathCalculatorFactory {

    private IPathCalculatorStrategy pathCalculatorStrategy;

    public PathCalculatorFactory(IPathCalculatorStrategy pathCalculatorStrategy){
        this.pathCalculatorStrategy = pathCalculatorStrategy;
    }

    public static IPathCalculatorStrategy getPathCalculator(String mode){
        if(mode.equalsIgnoreCase("bike")) {
            return new BikePathCalculator();
        }else if(mode.equalsIgnoreCase("car")){
            return new CarPathCalculator();
        }else if(mode.equalsIgnoreCase("walk")){
            return new WalkPathCalculator();
        }
        return null;
    }
}
