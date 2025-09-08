package org.example.java8.interfaces;

public interface Swimmable {

    default void fly() {
        System.out.println("Swimmable");
    }

    public void test();
}
