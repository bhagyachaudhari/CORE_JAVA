package org.example.oop.inheritance.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bhagyashri", 33);
        Employee employee2 = new Employee("RD", 35);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println("Before sorting: " + employees);
        //Collections.sort(employees, new AgeComparator());
        Collections.sort(employees);
        System.out.println("After sorting: " + employees);
    }

    @Override
    public int compareTo(Employee e) {
        return this.getName().compareTo(e.getName());
    }
}
