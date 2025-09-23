package org.example.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent implements Swimmable {
    @Override
    public Child getObject() throws RuntimeException {
        System.out.println("child object..");
        return new Child();
    }

     public void swim() {
        System.out.println("child is swimming");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method4() {

    }

    private void method2() {

    }

}
