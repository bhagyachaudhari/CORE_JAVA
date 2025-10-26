package org.example.java8.streamsapi;

import java.util.*;
import java.util.stream.Collectors;

public class Client4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,6,2,9,4,8,9);
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        String str = "I am playing cricket. I like to Play Cricket";
        System.out.print(Arrays.stream(str.split("\\s+")).count());
        System.out.println();
        Map<String, Long> map = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        map.forEach((str1, count) -> System.out.print(str1 + ": " + count + " "));
        System.out.println();

        Set<Integer> set = new HashSet<>();
        System.out.println(list.stream().anyMatch(num ->!set.add(num)));
        System.out.println();

        List<Student> students = Arrays.asList(
                new Student("Alice", 30, "New York"),
                new Student("Bob", 28, "Los Angeles"),
                new Student("Charlie", 35, "New York"),
                new Student("David", 25, "Los Angeles"),
                new Student("Eve", 30, "Chicago")
        );

        Map<String, Integer> empMap = students.stream()
                .collect(Collectors.toMap(Student::getName, Student::getAge));
        empMap.entrySet().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
        System.out.println();

        System.out.println(students.stream().map(Student::getCity).distinct().collect(Collectors.toList()));
        System.out.println();

        double avgAge = students.stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(students.stream().filter(s -> s.getAge() > avgAge).map(Student::getName).collect(Collectors.toList()));

        String str1 = "test,mumbai,pune,maharashtra";
        List<String> s = Arrays.stream(str1.split(",")).map(String::trim).collect(Collectors.toList());
        System.out.println(s);

        Map<String, Optional<Student>> map2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCity,
                        Collectors.maxBy(Comparator.comparingInt(Student::getAge))
                        ));

        map2.forEach((str3, stud)-> System.out.println(str3 + " " + stud.get()));

        Map<String, Integer> map3 = students.stream().collect(Collectors.groupingBy(
           Student::getCity,
           Collectors.summingInt(Student::getAge)
        ));

        map3.forEach((str4, ageSum)-> System.out.println(str4 + " " + ageSum));


    }
}

class Student {
    String name;
    int age;
    String city;

    Student(String name, int age, String city) {
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
