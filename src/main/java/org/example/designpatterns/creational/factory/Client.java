package org.example.designpatterns.creational.factory;

public class Client {
    public static void main(String[] args) {

        Platform platform = new Platform("android");
        UIComponent uiComponent = platform.createUI();
        uiComponent.createButton();
        uiComponent.createDropdown();

        Platform platform1 = new Platform("ios");
        UIComponent uiComponent1 = platform1.createUI();
        uiComponent1.createButton();
        uiComponent1.createDropdown();
    }
}
