package org.example.practice;

import java.io.IOException;

public class Parent {

    public Parent getObject() throws IOException {
        System.out.println("parent object..");
        return new Parent();
    }
}
