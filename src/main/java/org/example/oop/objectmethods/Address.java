package org.example.oop.objectmethods;

public class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Address copy() {
        return new Address(this.city);
    }
}
