package org.example.oop.inheritance.overriding;

class Test {
    private final void show() {
        System.out.println("Private Final Method");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show();  // ✅ Allowed, as it's within the same class

        // TThe final keyword prevents overriding.
        // The private keyword already prevents overriding.
        // So, marking it final is redundant.
    }
}
