package org.example.oop.abstraction;

public interface MyInterface {
    //protected void display();  // ❌ Compilation error

    default void show() {
        System.out.println("Default method");
    }

    static void display() {
        System.out.println("Static method");
    }

    //public abstract void  get();
}
