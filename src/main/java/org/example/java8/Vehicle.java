package org.example.java8;

public interface Vehicle {

    void start();

    default void honk() { // Default method
        System.out.println("Honking...");
    }

    static void fuelType() { // Static method
        System.out.println("Most vehicles use petrol or diesel.");
    }
}
