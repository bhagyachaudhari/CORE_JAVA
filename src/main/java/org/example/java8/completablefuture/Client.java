package org.example.java8.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Client {

    public static void main(String[] args) {
        CompletableFuture.runAsync(()->{
            System.out.println("Running in: " + Thread.currentThread().getName());
        });

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    return "Hello World";
                });

        String result = future.join(); // wait for result
        System.out.println(result);


        CompletableFuture<Integer> future1 =
                CompletableFuture.supplyAsync(() -> 10)
                        .thenApply(x -> x * 2);

        System.out.println(future1.join()); // 20

        CompletableFuture.supplyAsync(() -> "Java")
                .thenAccept(s -> System.out.println(s));

        CompletableFuture.supplyAsync(() -> "Done")
                .thenRun(() -> System.out.println("Finished"));

        ExecutorService executor = Executors.newFixedThreadPool(4);
        CompletableFuture.supplyAsync(() -> "Task", executor)
                .thenApplyAsync(s -> s + " Done", executor);

        CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 =
                CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> result1 =
                f1.thenCombine(f2, (a, b) -> a + b);

        System.out.println(result1.join()); // 30

        CompletableFuture<Void> all =
                CompletableFuture.allOf(f1, f2);

        all.join(); // wait

        System.out.println(f1.join());
        System.out.println(f2.join());

        CompletableFuture<Object> any =
                CompletableFuture.anyOf(f1, f2);

        System.out.println(any.join());

        CompletableFuture<Integer> future2 =
                CompletableFuture.supplyAsync(() -> {
                    if (true) throw new RuntimeException("Error");
                    return 10;
                }).exceptionally(ex -> 0);

        System.out.println(future2.join()); // 0

        CompletableFuture<Integer> future3 =
                CompletableFuture.supplyAsync(() -> 5)
                        .handle((res, ex) -> {
                            if (ex != null) return 0;
                            return res * 2;
                        });

        CompletableFuture<String> future4 = new CompletableFuture<>();

        new Thread(() -> {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            future.complete("Done!");
        }).start();

        System.out.println(future4.join());

        System.out.println("main");

    }
}
