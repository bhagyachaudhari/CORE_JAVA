package org.example.designpatterns.structural.decorator;

public class Wheap implements Addon{

    Beverage beverage;

    public Wheap(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 90 + beverage.getCost();
    }

    @Override
    public void getDesc() {
        System.out.println("Wheap added...");
    }
}
