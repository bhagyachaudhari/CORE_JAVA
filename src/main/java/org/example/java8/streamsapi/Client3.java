package org.example.java8.streamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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