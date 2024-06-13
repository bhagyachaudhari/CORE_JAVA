package org.example.designpatterns.structural.decorator;

public class Milk implements Addon{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 60 + beverage.getCost();
    }

    @Override
    public void getDesc() {
        System.out.println("Milk added...");
    }
}
