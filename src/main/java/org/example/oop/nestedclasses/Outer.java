package org.example.oop.nestedclasses;

public class Outer {
    private class Inner {
        void display() {
            System.out.println("Private Inner Class");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner(); // Creating an instance of the private inner class
        inner.display(); // Calling the method of the private inner class
    }
}
