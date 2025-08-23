package org.example.oop.inheritance.overloading;

class Test {
    private static int count = 0;

    public static int getCount() { // Using a getter to access it
        return count;
    }

    void show() {}      // Default access
    public void show(int a) {}  // Public access
    private void show(String s) {}  // Private access
}
