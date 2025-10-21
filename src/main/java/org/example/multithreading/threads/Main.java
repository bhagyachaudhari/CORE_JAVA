package org.example.multithreading.threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Starts a new thread

        Thread t2 = new Thread(new PrintNumber(10));
        t2.start();  // Starts a new thread
    }
}