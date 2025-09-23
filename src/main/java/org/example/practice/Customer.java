package org.example.practice;

public class Customer {

    private static String name;
    public String address;

    public Customer() {
        System.out.println("constructor called.." + address + name);
    }

    static {
        System.out.println("name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("main start");
        Customer c1 = new Customer();
        System.out.println("main end");
        System.out.println("address " + c1);
    }
}
