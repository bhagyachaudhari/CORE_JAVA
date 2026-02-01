package my.practice.multithreading;

import java.util.concurrent.BlockingQueue;

public class QConsumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public QConsumer(BlockingQueue<Integer> queue) {
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