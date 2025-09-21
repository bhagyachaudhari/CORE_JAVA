package org.example.multithreading.synchronization;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    // Shared BlockingQueue
    private static final int QUEUE_CAPACITY = 5;
    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

    public static void main(String[] args) {
        // Producer Thread
        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    System.out.println("Producer is producing: " + value);
                    queue.put(value); // blocks if queue is full
                    value++;
                    Thread.sleep(500); // simulate time to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Integer taken = queue.take(); // blocks if queue is empty
                    System.out.println("Consumer is consuming: " + taken);
                    Thread.sleep(1000); // simulate time to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
