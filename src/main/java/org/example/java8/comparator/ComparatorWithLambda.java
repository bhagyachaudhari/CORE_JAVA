package org.example.java8.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 32));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 25));

        // Sort by age using lambda
        people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
        System.out.println("Sorted by age (lambda): " + people);

        // Sort by name using lambda
        people.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("Sorted by name (lambda): " + people);

        // Sort by age using Comparator.comparing()
        people.sort(Comparator.comparing(p -> p.age));
        System.out.println("Sorted by age (comparing): " + people);

        // Sort by name using Comparator.comparing()
        people.sort(Comparator.comparing(p -> p.name));
        System.out.println("Sorted by name (comparing): " + people);
    }
}