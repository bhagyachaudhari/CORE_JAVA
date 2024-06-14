package org.example.designpatterns.creational.factory;

public class Platform {

    private String name;
    public Platform(String name){
        this.name = name;
    }

    public UIComponent createUI(){
        return UIfactory.getUIfactory(this.name);
    }
}
