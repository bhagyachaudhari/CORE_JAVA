package my.practice.designpatterns.behavioural.observer;

public class TVDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("TVDisplay weather: "+ weather);
    }
}
