package org.example.oop.staticexamples;

public class OuterClass1 {

    private String message = "Hello from OuterClass";

    class InnerClass {
        void display() {
            System.out.println(message); // Accessing outer class private member
        }
    }
}
