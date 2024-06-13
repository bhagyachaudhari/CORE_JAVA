package org.example.designpatterns.structural.facade;

public class VegNonVegBothRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        return new VegNonVegBothMenu();
    }
}
