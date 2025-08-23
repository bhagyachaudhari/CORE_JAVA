package org.example.oop.accessmodifiers.protectedexample;

public class Parent {
    protected void show() {
        System.out.println("Protected method");
    }

    public static void main(String[] args) {
        new Parent().show(); // Allowed, as main is in the same class
    }
}
