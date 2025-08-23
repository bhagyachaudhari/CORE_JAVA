package org.example.oop.inheritance.overriding.package2;


import org.example.oop.inheritance.overriding.package1.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        //obj.display();  // ❌ Compilation Error (Cannot access protected method this way)
        //System.out.println(obj.x);  // ❌ Compilation error
    }
}
