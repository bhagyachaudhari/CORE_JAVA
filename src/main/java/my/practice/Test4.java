package my.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4 {

    public static void main(String[] args) {
        String str = "aaaawewrwr";
        str.chars().boxed().collect(Collectors.toList());


    }
}


class Employee1 {
    String department;
    String name;
    Employee1(String department, String name) {
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


