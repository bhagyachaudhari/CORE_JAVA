package org.example.java8.interfaces;

public interface Flyable {

    default void fly() {
        System.out.println("Flyable");
    }

    public void test();
}
