package org.example.oop.inheritance.overriding;

class Child extends Parent {

    Child() {
        super(); // ✅ Allowed
    }

    /*static void show() {  // This is NOT overriding, but hiding //compilation error
        System.out.println("Child Static Method");
    }*/

    public void show1() { // Allowed (protected → public)
        System.out.println("Public method in Child");
    }

    //protected void show2() {}  // ❌ Compilation Error

    //protected void show3() { }  // ❌ Compilation Error (cannot reduce visibility)
    public void show4() { }  // ✅ Allowed (increasing visibility)

    // void display() { } // Compilation error
}
