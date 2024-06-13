package org.example.designpatterns.structural.facade;

public class NonVegRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
