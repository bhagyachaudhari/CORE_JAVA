package org.example.oop.accessmodifiers.defaultexample;

public class MyClass {
    void display() { // default access
        System.out.println("Default access method");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display(); // Accessing the default method within the same package
    }
}
