package org.example.oop.abstraction;

public class Main {

    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Upcasting
        myCar.start(); // Output: Car is starting with a key...
        myCar.stop();  // Output: Vehicle is stopping...

        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound(); // Output: Bark!

        Calculator sum = (a, b) -> a + b;
        System.out.println(sum.add(5, 3)); // Output: 8

        Test1 t = new Test1();
        t.show();  // Calls default method
        MyInterface.display(); // Calls static method
    }
}
