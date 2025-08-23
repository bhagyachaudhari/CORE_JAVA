package org.example.multithreading.deadlock;

class DeadlockFree {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void method1() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Method 1 executed");
            }
        }
    }

    void method2() {
        synchronized (lock1) {  // Same lock order as method1
            synchronized (lock2) {
                System.out.println("Method 2 executed");
            }
        }
    }
}