package org.example.oop.inheritance;

import java.io.FileNotFoundException;

public class Child extends Parent{

    public void display() throws RuntimeException {
        System.out.println("Parent display...");
    }

    public void working() throws ArithmeticException, RuntimeException{
        System.out.println("Parent working...");
    }

    public int area(int l, int b){
        return l*b;
    }

    public static void main(String args[]){
        Child c = new Child();
        System.out.println(c.area(3, 4));
        System.out.println(c.area(2));
        Parent p = new Parent();
        System.out.println(p.area(7));
    }
}
