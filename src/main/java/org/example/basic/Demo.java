package org.example.basic;

public class Demo {

    Demo(){
        System.out.println("Constructor called");
    }

    {
        System.out.println("Instance Initializer Block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        new Demo();
    }

}
