package org.example.designpatterns.creational.factory;

import org.example.designpatterns.creational.factory.button.Button;
import org.example.designpatterns.creational.factory.button.IOSButton;
import org.example.designpatterns.creational.factory.dropdown.Dropdown;
import org.example.designpatterns.creational.factory.dropdown.IOSDropdown;

public class IOSUIComponentFactory implements UIComponent {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
