package org.example.oop.staticexamples;

public class OuterClass2 {

    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Inside local inner class");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }
}
