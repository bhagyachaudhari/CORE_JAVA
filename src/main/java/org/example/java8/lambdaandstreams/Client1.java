package org.example.java8.lambdaandstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alice", "Bob", "Ankita");
        // Using Stream API to filter and sort
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(filtered); // [Alice]

        List<String> names3 = Arrays.asList("Charlie", "Alice", "Bob");
        List<String> sortedNames = names3.stream()
                .sorted() // natural alphabetical order
                .collect(Collectors.toList());
        System.out.println(sortedNames); // [Alice, Bob, Charlie]

        List<Integer> numbers2 = Arrays.asList(5, 2, 8, 1);
        List<Integer> sortedDesc = numbers2.stream()
                .sorted((a, b) -> b - a) // descending order
                .collect(Collectors.toList());
        System.out.println(sortedDesc); // [8, 5, 2, 1]

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );
        // Sort by age
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparing(person -> person.age))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);

        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing((Person p) -> p.name)
                        .thenComparing(p -> p.age))
                .collect(Collectors.toList());
        System.out.println(sorted);


    }
}
