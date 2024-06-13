package org.example.designpatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        System.out.println(beverage.getCost());
        beverage.getDesc();

        beverage = new Milk(beverage);
        System.out.println(beverage.getCost());
        beverage.getDesc();

        beverage = new Wheap(beverage);
        System.out.println(beverage.getCost());
        beverage.getDesc();

        System.out.println("Total Cost = "+ beverage.getCost());
    }
}
