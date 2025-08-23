package org.example.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Thread pool of size 3

        for (int i = 1; i <= 5; i++) {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing...");
            });
        }

        executor.shutdown();  // Stop accepting new tasks
    }
}
