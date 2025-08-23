package org.example.java8.lambdaandstreams;

import java.util.Arrays;
import java.util.List;

public class Client4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        list.parallelStream()
                .forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jane", "Jake", "Jill");
        names.parallelStream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + ": " + name));

        names.parallelStream()
                .forEachOrdered(System.out::println);  // Preserves order

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println(sum); // 15
    }
}
