package org.example.practice;

import java.io.IOException;

public class Client2 {

    static {
        System.out.println("stattic block");
    }

    {
        System.out.println("instance initializer..");
    }

    public Client2() {
        System.out.println("constructor called");
    }

    public static void main(String[] args) throws IOException {
        Client2 client2 = new Client2();
        Parent p = new Child();
        System.out.println(p.getObject());

        Child c = new Child();
        System.out.println(c.getObject());
        c.swim();
        Swimmable.waterparking();
        c.swim();

        Parent p1 = new Parent();
        p1.getObject();
    }
}
