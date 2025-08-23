package org.example.oop.abstraction.comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // For printing
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

