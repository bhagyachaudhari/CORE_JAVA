package org.example.oop.basics;

class Person {
    String name;
}

public class PassByReferenceExample {

    public static void modify(Person p) {
        p.name = "Alice"; // Modifies the same object
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Bob";

        modify(person);
        System.out.println(person.name);  // Output: Alice (object was modified)
    }
}
