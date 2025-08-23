package org.example.oop.abstraction;

abstract class Vehicle {

    abstract void start(); // Abstract method (no implementation)

    void stop() { // Concrete method
        System.out.println("Vehicle is stopping...");
    }
}
