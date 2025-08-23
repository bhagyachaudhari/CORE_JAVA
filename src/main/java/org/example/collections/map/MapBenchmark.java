package org.example.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.*;

public class MapBenchmark {

    private static final int THREAD_COUNT = 10;
    private static final int OPERATIONS = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        benchmarkMap(new HashMap<>(), "HashMap (No Sync)");
        benchmarkMap(Collections.synchronizedMap(new HashMap<>()), "Synchronized HashMap");
        benchmarkMap(new Hashtable<>(), "Hashtable");
        benchmarkMap(new ConcurrentHashMap<>(), "ConcurrentHashMap");
    }

    private static void benchmarkMap(Map<Integer, Integer> map, String label) throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.execute(() -> {
                for (int j = 0; j < OPERATIONS; j++) {
                    int key = ThreadLocalRandom.current().nextInt(1000);
                    map.put(key, key);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        long duration = System.currentTimeMillis() - start;

        System.out.printf("%-25s : %d ms%n", label, duration);
    }
}
