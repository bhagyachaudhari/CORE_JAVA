package org.example.multithreading.communication;

public class Shared {

    private boolean flag = false;

    synchronized void producer() {
        try {
            System.out.println("Producer waiting...");
            while (flag) wait();  // Wait until flag is false
            System.out.println("Produced");
            flag = true;
            notify();  // Notify consumer
        } catch (InterruptedException e) {}
    }

    synchronized void consumer() {
        try {
            System.out.println("Consumer waiting...");
            while (!flag) wait();  // Wait until flag is true
            System.out.println("Consumed");
            flag = false;
            notify();  // Notify producer
        } catch (InterruptedException e) {}
    }
}
