package org.example.oop.abstraction.comparable;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee e) {
        return this.id - e.id; // Sort by ID
    }
}