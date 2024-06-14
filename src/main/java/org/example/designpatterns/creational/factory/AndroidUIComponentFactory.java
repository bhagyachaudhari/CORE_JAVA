package org.example.designpatterns.creational.factory;

import org.example.designpatterns.creational.factory.button.AndroidButton;
import org.example.designpatterns.creational.factory.button.Button;
import org.example.designpatterns.creational.factory.dropdown.AndroidDropdown;
import org.example.designpatterns.creational.factory.dropdown.Dropdown;

public class AndroidUIComponentFactory implements UIComponent {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
