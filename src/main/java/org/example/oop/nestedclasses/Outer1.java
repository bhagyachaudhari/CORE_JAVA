package org.example.oop.nestedclasses;

public class Outer1 {
    private class Inner1 {
        void display() {
            System.out.println("Private Inner Class");
        }
    }

    void accessInner() {
        Inner1 obj = new Inner1();
        obj.display(); // Accessing private inner class from Outer class
    }
}
