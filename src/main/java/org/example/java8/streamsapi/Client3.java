package org.example.java8.streamsapi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "efg", "o", "eop", "r");
        list.stream().forEach(s -> System.out.print(s+ " ") );
        System.out.println();

        int[] arr = new int[] {3,5,2,9,6,3,15,7,20,9,0,5,};
        Arrays.stream(arr).forEach(i -> System.out.print(i+ " "));
        System.out.println();

        Stream.of("test", "test3").forEach(str -> System.out.print(str+ " "));
        System.out.println();

        String[] strlist = new String[] {"icecream", "cake", "burger", "pizza", "icecream", "cake"};
        Arrays.stream(strlist).map(s -> s + " tests good,").forEach(str-> System.out.print(str + " "));
        System.out.println();

        Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(itr -> System.out.print(itr + " "));
        System.out.println();

        List<List<String>> arrlist = Arrays.asList(Arrays.asList("bhagyac", "sonali"), Arrays.asList("rina", "neha", "pooja"), Arrays.asList("sanjivani"));
        System.out.println(arrlist.stream().flatMap(List::stream).collect(Collectors.toList()));

        Arrays.stream(arr).distinct().forEach(distinctnumbers -> System.out.print(distinctnumbers + " "));
        System.out.println();

        Arrays.stream(arr).sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> result = names.stream()
                .peek(name -> System.out.print("Original: " + name + " "))
                .map(String::toUpperCase)
                .peek(name -> System.out.print("Uppercase: " + name + " "))
                .collect(Collectors.toList());

        System.out.println(result);

        Arrays.stream(arr).limit(2).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Arrays.stream(arr).skip(3).forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println(Arrays.stream(strlist).collect(Collectors.toSet()));

        int sum = Arrays.stream(arr).reduce(0, (a,b) ->a+b);
        System.out.println(sum);
        long count = Arrays.stream(arr).count();
        System.out.println(count);

        System.out.println(Arrays.stream(arr).anyMatch(n -> n == 5));
        System.out.println(Arrays.stream(arr).allMatch(n -> n == 5));
        System.out.println(Arrays.stream(arr).noneMatch(n -> n == 10));

        System.out.println(Arrays.stream(arr).filter(n -> n > 10).findFirst());
        System.out.println(list.parallelStream().filter(s -> s.startsWith("e")).findAny());

        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "Los Angeles"),
                new Person("Charlie", 35, "New York"),
                new Person("David", 25, "Los Angeles"),
                new Person("Eve", 30, "Chicago")
        );

        Map<String, List<Person>> map = people.stream().collect(Collectors.groupingBy(Person::getCity));
        map.forEach((city, person) -> System.out.println(city + ": " + person.stream().collect(Collectors.toList())));

        System.out.println();

        Map<String, Long> map1 = people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
        map1.forEach((city, c) -> System.out.println(city + ": " + c));

        System.out.println();

        Map<String, List<String>> map2 = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));
        map2.forEach((str1, str2) -> System.out.println(str1 + ": " + str2));

        System.out.println();

        Map<String, Integer> map3 = people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.summingInt(Person::getAge)));
        map3.forEach(((str1, str2) -> System.out.println(str1 + ": " + str2)));

        Map<String, Map<Integer, List<Person>>> cityThenAge = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.groupingBy(Person::getAge)
                ));

        cityThenAge.forEach((city, m) -> {
            System.out.println(city + " -> " + m);
        });


        Map<Boolean, List<Person>> partitioned = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() >= 30));

        partitioned.forEach((isAdult, l) -> {
            System.out.println(isAdult + " -> " + l);
        });


        Map<Boolean, Long> countPartition = people.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.getAge() >= 30,
                        Collectors.counting()
                ));

        countPartition.forEach((isAdult, count1) -> System.out.println(isAdult + " -> " + count1));

        Map<Boolean, List<String>> namesPartition = people.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.getAge() >= 30,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));

        namesPartition.forEach((isAdult, names1) -> System.out.println(isAdult + " -> " + names1));

        Map<Boolean, Optional<Person>> oldestInPartition = people.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.getAge() >= 30,
                        Collectors.maxBy(Comparator.comparingInt(Person::getAge))
                ));

        oldestInPartition.forEach((isAdult, person) -> System.out.println(isAdult + " -> " + person));


        List<String> words = Arrays.asList("Java", "is", "fun");
        String result1 = words.stream()
                .collect(Collectors.joining());
        System.out.println(result1); // "Javaisfun"
        System.out.println(words.stream()
                .collect(Collectors.joining(" "))); // "Javaisfun"
        System.out.println(words.stream()
                .collect(Collectors.joining("-","[","]"))); // "Javaisfun"

        String str = "testing is in progress";
        System.out.println(Stream.of(str).collect(Collectors.toList()));
        List<String> words1 = Arrays.stream(str.split(" "))
                .collect(Collectors.toList());
        System.out.println(words);

        double averageAge = people.stream()
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println(averageAge);

        double averageAge1 = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println(averageAge1);

        Map<Integer, Double> avgByNameLength = people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.name.length(),
                        Collectors.averagingInt(Person::getAge)
                ));

        avgByNameLength.forEach((len, avg) -> System.out.println(len + " -> " + avg));


        Optional<Integer> totalAge = people.stream()
                .collect(Collectors.reducing(
                        (p1, p2) -> new Person("", p1.getAge() + p2.getAge(), "")
                ))
                .map(Person::getAge);

        totalAge.ifPresent(System.out::println);

        int totalAge1 = people.stream()
                .collect(Collectors.reducing(
                        0,
                        Person::getAge,
                        Integer::sum
                ));

        System.out.println(totalAge1);


        Stream<String> stream = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();
        System.out.println(stream.collect(Collectors.toList()));

    }
}


class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + city + ")";
    }
}