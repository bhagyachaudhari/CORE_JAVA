package my.practice.designpatterns.behavioural.observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("PhoneDisplay weather: "+ weather);
    }
}
