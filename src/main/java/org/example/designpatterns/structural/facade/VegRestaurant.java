package org.example.designpatterns.structural.facade;

public class VegRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
