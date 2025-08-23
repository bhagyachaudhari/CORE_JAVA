package org.example.oop.abstraction;

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    void walk() {
        System.out.println("Dog is walking");
    }
}