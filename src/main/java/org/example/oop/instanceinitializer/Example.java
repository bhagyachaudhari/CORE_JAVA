package org.example.oop.instanceinitializer;

public class Example {
    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block executed");
    }

    // Constructor
    Example() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
    }
}
