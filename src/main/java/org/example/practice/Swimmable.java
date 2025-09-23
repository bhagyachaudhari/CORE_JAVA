package org.example.practice;

public interface Swimmable {

    default void swim() {
        System.out.println("swimming");
    }

    static void waterparking() {
        System.out.println("water parking");
    }

    public void method1();
    private void method2() {

    }
    //protected void method3();
    void method4();

}
