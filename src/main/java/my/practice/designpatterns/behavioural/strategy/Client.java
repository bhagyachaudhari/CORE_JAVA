package my.practice.designpatterns.behavioural.strategy;

public class Client {

    public static void main(String[] args) {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator("bike");
        pathCalculator.calculate();
    }
}
