package org.example.oop.accessmodifiers.publicexample;

public class MyClass {
    public int x = 10;
    public void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new MyClass().display();
    }
}
