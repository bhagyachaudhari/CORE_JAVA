package org.example.java8.lambdaandstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Client3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // With identity
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum); // Output: 15

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product); // Output: 120

        List<String> words = Arrays.asList("Java", "8", "Stream");
        String result = words.stream()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result.trim()); // Output: Java 8 Stream

        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);
        max.ifPresent(System.out::println); // Output: 5

        int totalLength = words.parallelStream()
                .reduce(0,
                        (sum1, word) -> sum1 + word.length(),   // accumulator
                        Integer::sum                          // combiner
                );
        System.out.println(totalLength); // Output: 14

        List<Integer> empty = new ArrayList<>();
        Optional<Integer> result1 = empty.stream().reduce(Integer::sum);
        System.out.println(result1.orElse(-1)); // Output: -1 (default fallback)

        List<String> words1 = Arrays.asList("Java", "Stream", "API");

        int totalLength1 = words1.parallelStream()
                .reduce(
                        0,                           // identity
                        (partialSum, word) -> partialSum + word.length(),  // accumulator
                        Integer::sum                 // combiner
                );

        System.out.println(totalLength1); // Output: 13

    }
}
