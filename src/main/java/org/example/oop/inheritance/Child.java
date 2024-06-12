package org.example.oop.inheritance;

import java.io.FileNotFoundException;

public class Child extends Parent{

    public void display() throws RuntimeException {
        System.out.println("Parent display...");
    }

    public void working() throws ArithmeticException, RuntimeException{
        System.out.println("Parent working...");
    }
}
