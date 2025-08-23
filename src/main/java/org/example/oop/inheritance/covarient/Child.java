package org.example.oop.inheritance.covarient;

public class Child extends Parent{
    @Override
    Child show() {  // Covariant return type: returning a subtype (Child)
        System.out.println("Child's show method");
        return this;
    }
}
