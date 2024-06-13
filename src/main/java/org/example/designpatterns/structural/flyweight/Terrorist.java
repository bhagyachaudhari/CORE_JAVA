package org.example.designpatterns.structural.flyweight;

public class Terrorist implements Player{
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist()
    {
        TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {

    }

    @Override
    public void mission() {

    }
}
