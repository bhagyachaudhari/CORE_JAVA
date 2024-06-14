package org.example.designpatterns.creational.factory;

public class UIfactory {

    public static UIComponent getUIfactory(String name){
        if(name.equalsIgnoreCase("android")){
            return new AndroidUIComponentFactory();
        }else if(name.equalsIgnoreCase("ios")){
            return new IOSUIComponentFactory();
        }
        return null;
    }
}
