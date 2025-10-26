package org.example.java8.streamsapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Client1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = numbers.stream().filter(n -> (n % 2 == 0)).collect(Collectors.toList());
        System.out.println(evens);

        List<String> names = Arrays.asList("john", "paul", "george", "ringo");
        List<String> upper = names.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);

        List<Integer> nums = Arrays.asList(3, 5, 7, 9);
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(list.stream().count());
        System.out.println(list.stream().min(Integer::compare).get());
        System.out.println(list.stream().max(Integer::compare).get());
        System.out.println(list.stream().mapToInt(Integer::intValue).average().getAsDouble());


        List<Employee> employees = Arrays.asList(
                new Employee("HR", "Alice"),
                new Employee("IT", "Bob"),
                new Employee("HR", "Charlie"),
                new Employee("IT", "David")
        );

        Map<String, List<Employee>> groupByDep = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        groupByDep.forEach((dept, emp) -> {
            System.out.println(dept + ": " + emp.stream().map(e -> e.name).collect(Collectors.joining(", ")));
        });


        List<String> studNames = Arrays.asList("John", "Alice", "Bob", "Charlie");
        List<String> sortedStudNames = studNames.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sortedStudNames);

        List<String> empNames = Arrays.asList("John", "Alice", "Bob", "Charlie");
        List<String> sortedEmpNames = empNames.stream()
                .sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedEmpNames);

        List<String> names1 = Arrays.asList("John", "Paul", "George", "Ringo");
        System.out.println(names1.stream().findFirst().get());
        System.out.println(names1.stream().filter(s -> s.startsWith("G")).findAny().get());

        List<Integer> numbers2 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        System.out.println(numbers2.parallelStream().mapToInt(Integer::intValue).sum());

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("John", "Paul"),
                Arrays.asList("George", "Ringo")
        );

        List<String> namesNestedop = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(namesNestedop);

        List<Integer> numbers3 = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        List<Integer> distinct = numbers3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);

        List<String> names4 = Arrays.asList("John", "Paul", "George", "Ringo");
        String joined = names4.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joined); // John, Paul, George, Ringo

        List<Integer> numbers4 = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        int secondLargest = numbers4.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);

        List<FullTimeEmployee> fullTimeEmployees = Arrays.asList(
                new FullTimeEmployee("Alice", 70000, "IT"),
                new FullTimeEmployee("Bob", 55000, "HR"),
                new FullTimeEmployee("Charlie", 90000, "IT"),
                new FullTimeEmployee("David", 40000, "Finance")
        );

        // 1️⃣ Employees with salary > 50k
        List<String> highEarners = fullTimeEmployees.stream()
                .filter(e -> e.salary > 50000)
                .map(e -> e.name)
                .collect(Collectors.toList());
        System.out.println("High Earners: " + highEarners);

        // 2️⃣ Average salary per department
        Map<String, Double> avgSalaryByDept = fullTimeEmployees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.averagingDouble(e -> e.salary)
                ));
        System.out.println("Average Salary by Dept: " + avgSalaryByDept);

        // 3️⃣ Highest paid employee
        FullTimeEmployee top = fullTimeEmployees.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .get();
        System.out.println("Highest Paid: " + top.name);

        int[] arr = new int[] {1,5,2,8,7};
        List<Integer> list1 = Arrays.stream(arr).boxed()
                .collect(Collectors.toList());
        System.out.println(list1);


        // Practice..

        Map<String, List<FullTimeEmployee>> map = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.toList()
                ));

        map.forEach((k, v)-> System.out.println(k + ": " + v.stream().map(emp->emp.getName()).collect(Collectors.toList())));
        map.forEach((k, v)-> System.out.println(k + ": " + v.stream().map(emp->emp.getName()).collect(Collectors.joining(","))));

        Map<String, Double> map1 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.averagingDouble(FullTimeEmployee::getSalary)
                ));

        map1.forEach((k, v)-> System.out.println(k + ": " + v));

        Map<String, Double> map2 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.summingDouble(FullTimeEmployee::getSalary)
                ));

        map2.forEach((k, v)-> System.out.println(k + ": " + v));

        Map<String, Long> map3 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.counting()
                ));

        map3.forEach((k, v)-> System.out.println(k + ": " + v));

        Map<String, List<Double>> map4 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.mapping(FullTimeEmployee::getSalary, Collectors.toList())
                ));

        map4.forEach((k, v)-> System.out.println(k + ": " + v));

        Map<String, List<Double>> map5 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.mapping(FullTimeEmployee::getSalary, Collectors.toList())
                ));

        map5.forEach((k, v)-> System.out.println(k + ": " + v));

        Map<String, Double> map6 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.reducing(0.0, FullTimeEmployee::getSalary, Double::sum)
                ));

        map6.forEach((k, v)-> System.out.println(k + ": " + v));

        Map<String, String> map7 = fullTimeEmployees.stream().collect(
                Collectors.groupingBy(
                        FullTimeEmployee::getDepartment,
                        Collectors.reducing("", FullTimeEmployee::getName, String::concat)
                ));

        map7.forEach((k, v)-> System.out.println(k + ": " + v));

        System.out.println(fullTimeEmployees.stream().map(FullTimeEmployee::getName)
                .collect(Collectors.reducing((e1,e2) ->e1 + ", " + e2)).orElse(null));

        Map<Boolean, List<FullTimeEmployee>> map8 = fullTimeEmployees.stream().collect(Collectors.partitioningBy(
           e -> e.getSalary() > 60000, Collectors.toList()
        ));

        map8.forEach((k, v)-> System.out.println(k + ": " + v.stream().map(FullTimeEmployee::getName).collect(Collectors.toList())));

    }
}


class Employee {
    String department;
    String name;
    Employee(String department, String name) {
        this.department = department;
        this.name = name;
    }
}


class FullTimeEmployee {
    String name;
    double salary;
    String department;

    FullTimeEmployee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

