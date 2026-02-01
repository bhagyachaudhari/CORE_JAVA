package my.practice.multithreading;

public class Shared {

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





















