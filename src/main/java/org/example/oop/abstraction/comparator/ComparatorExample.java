package org.example.oop.abstraction.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 32));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 25));

        // Sort by age
        Collections.sort(people, new AgeComparator());
        System.out.println("Sorted by age: " + people);

        // Sort by name
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name: " + people);
    }
}