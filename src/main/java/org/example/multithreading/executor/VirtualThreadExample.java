package org.example.multithreading.executor;

import java.util.concurrent.Executors;

public class VirtualThreadExample {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 1000; i++) {
                executor.submit(() -> System.out.println(Thread.currentThread()));
            }
        }
    }
}
