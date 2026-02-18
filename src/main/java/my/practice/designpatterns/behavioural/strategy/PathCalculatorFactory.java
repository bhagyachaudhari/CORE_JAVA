package my.practice.designpatterns.behavioural.strategy;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(String type) {
        return switch (type) {
            case "bike" -> new BikePath();
            case "car" -> new BikePath();
            default -> throw new RuntimeException();
        };
    }
}
