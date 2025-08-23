package org.example.collections.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class Example {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Put values
        map.put("apple", 10);
        map.put("banana", 20);

        // Get a value
        System.out.println("Apple count: " + map.get("apple"));

        // Update value using compute
        map.compute("apple", (k, v) -> (v == null) ? 1 : v + 1);

        map.putIfAbsent("banana", 30); // This will not change the value since "banana" already exists

        // Iterating the map (safe for concurrent use)
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
