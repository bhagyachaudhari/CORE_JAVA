package org.example.oop.inheritance;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class D implements B, C {
    // Must override show() to resolve conflict
    public void show() {
        B.super.show(); // explicitly choose one
    }
}

public class Main {
    public static void main(String[] args) {
        new D().show();  // Output: B
    }
}
