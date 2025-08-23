package org.example.java14;

class RecordsExample {

    // Using the record
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        System.out.println(person.name());  // prints: Alice
        System.out.println(person.age());   // prints: 30

        // Records automatically have equals, hashCode, and toString implemented
        System.out.println(person);         // prints: Person[name=Alice, age=30]
    }

}

// Defining a record
public record Person(String name, int age) {}
