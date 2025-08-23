package org.example.oop.accessmodifiers.privateexample;

public class MyClass {
    private int data = 42;

    private void show() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("Data: " + myClass.data); // Accessing private field
        myClass.show(); // Accessing private method
    }
}
