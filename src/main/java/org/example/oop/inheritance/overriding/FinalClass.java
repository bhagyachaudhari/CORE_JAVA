package org.example.oop.inheritance.overriding;

final class FinalClass {

    final int MAX_LIMIT = 100;

    final int MAX_USERS = 100; // Constant

    void updateLimit() {
        // MAX_USERS = 200; // Compilation error: cannot change final variable
    }

    protected void show() { // Allowed but useless (no subclass can access it)
        System.out.println("Protected method in a final class");
    }
}
