package org.example.oop.instanceofexample;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Dog);      // true
        System.out.println(a instanceof Animal);   // true
        System.out.println(a instanceof Object);   // true
    }
}
