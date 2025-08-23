package org.example.oop.inheritance.overriding.package2;


import org.example.oop.inheritance.overriding.package1.A;

public class B1 extends A {
    void show() {
        display();  // ✅ Allowed via inheritance
    }
}