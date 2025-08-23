package org.example.oop.inheritance.composition;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine is starting...");
    }
}
