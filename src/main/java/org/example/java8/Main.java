package org.example.java8;

public class Main {

    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start(); // Output: Bike is starting...
        myBike.honk();  // Output: Honking...

        Vehicle.fuelType(); // Output: Most vehicles use petrol or diesel.
    }
}
