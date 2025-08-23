package org.example.multithreading.communication;

public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        Shared1 s = new Shared1();
        new Producer(s).start();
        new Consumer(s).start();
    }
}

class Producer extends Thread {
    Shared1 s;
    Producer(Shared1 s) { this.s = s; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                s.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Shared1 s;
    Consumer(Shared1 s) { this.s = s; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                s.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Shared1 {
    private int number;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();  // Wait if value is already produced
        }
        number = value;
        available = true;
        System.out.println("Produced: " + number);
        notify();  // Notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();  // Wait if no value is produced yet
        }
        System.out.println("Consumed: " + number);
        available = false;
        notify();  // Notify producer
    }
}
