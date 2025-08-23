package org.example.oop.objectmethods;

public class Employee {
    private String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee deepCopy() {
        return new Employee(this.name, this.address.copy());
    }
}
