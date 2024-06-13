package org.example.designpatterns.structural.decorator;

public class Decaf implements Beverage{
    @Override
    public double getCost() {
        return 450;
    }

    @Override
    public void getDesc() {
        System.out.println("Decaf added...");
    }
}
