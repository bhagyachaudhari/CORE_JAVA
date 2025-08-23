package org.example.multithreading.completable;

import java.util.concurrent.CompletableFuture;

public class AsyncExample {

    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> {
            System.out.println("Running in background: " + Thread.currentThread().getName());
        }).thenRun(() -> System.out.println("Task completed"));

        CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching data...");
            return "Data";
        }).thenApply(data -> {
            System.out.println("Processing " + data);
            return "Processed " + data;
        }).thenAccept(System.out::println);
    }
}
