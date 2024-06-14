package org.example.designpatterns.creational.factory;

import org.example.designpatterns.creational.factory.button.Button;
import org.example.designpatterns.creational.factory.dropdown.Dropdown;

public interface UIComponent {

    public Button createButton();
    public Dropdown createDropdown();
}
