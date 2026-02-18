package my.practice.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
                    System.out.println("size: "+queue.size());
                    value++;
                    Thread.sleep(5000); // simulate time to produce
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
                    //System.out.println(queue.size() +"");
                    System.out.println("Consumer is consuming: " + taken);
                    Thread.sleep(50000); // simulate time to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
