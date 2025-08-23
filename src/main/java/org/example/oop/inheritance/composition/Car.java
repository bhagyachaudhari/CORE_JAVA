package org.example.oop.inheritance.composition;

public class Car {
    private Engine engine; // Composition: Car has an Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Car is starting...");
        engine.start(); // Delegation to the Engine object
    }
}
