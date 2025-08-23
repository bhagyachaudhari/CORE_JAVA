package org.example.multithreading.communication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Producer Thread
class Producer1 implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer1(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Producing: " + i);
                queue.put(i);  // Automatically waits if queue is full
                Thread.sleep(500);  // Simulate time delay
            }
            queue.put(-1);  // Poison pill to signal consumer to stop
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer Thread
class Consumer1 implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer1(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int value = queue.take();  // Automatically waits if queue is empty
                if (value == -1) break;    // Stop condition
                System.out.println("Consumed: " + value);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Main Class
public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);  // Capacity of 2
        new Thread(new Producer1(queue)).start();
        new Thread(new Consumer1(queue)).start();
    }
}
