package org.example.java10;

public class Client {
    public static void main(String[] args) {
        var message = "Hello, world!";  // compiler infers String
        var count = 42;                 // compiler infers int

        System.out.println(message);  // prints: Hello, world!
        System.out.println(count);    // prints: 42
    }

}
