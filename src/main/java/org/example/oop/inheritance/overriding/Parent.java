package org.example.oop.inheritance.overriding;

class Parent {

    protected Parent() { System.out.println("Protected Constructor"); }

    protected static void show() {
        System.out.println("Protected Static Method");
    }

    protected void show1() {
        System.out.println("Protected method in Parent");
    }

    public void show2() {}
    public void show3() { }
    protected void show4() { }

    final void display() {
        System.out.println("Cannot be overridden");
    }
}
