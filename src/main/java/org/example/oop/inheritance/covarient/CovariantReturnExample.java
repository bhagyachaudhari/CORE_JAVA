package org.example.oop.inheritance.covarient;

public class CovariantReturnExample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); // Calls Child's show method
    }
}
