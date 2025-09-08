package org.example.java8.interfaces;

public class Demo implements Flyable, Swimmable {
    /*@Override
    public void fly() {
        System.out.println("Flying in the sky from Demo class!");
    }*/

    public static void main(String... args) {
        Demo demo = new Demo();
        demo.fly(); // Calls the overridden method in Demo class
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public void test() {

    }
}
