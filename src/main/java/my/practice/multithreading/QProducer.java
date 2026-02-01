package my.practice.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QProducer implements Runnable{

    BlockingQueue<Integer> queue;

    public QProducer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
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
