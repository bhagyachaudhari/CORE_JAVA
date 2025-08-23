package org.example.oop.inheritance.composition;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car(engine); // Injecting engine into the car
        car.startCar();
    }
}
