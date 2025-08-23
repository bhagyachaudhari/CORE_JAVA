package org.example.java8.lambdaandstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

public class Client5 {

    public static void main(String[] args) {
        Callable<String> callable = () -> "Result from callable";
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        int result = comparator.compare(5, 10);
        System.out.println(result); // Output: -1 (because 5 < 10)

        Predicate<String> isLong = (str) -> str.length() > 5;
        System.out.println(isLong.test("Hello"));     // false
        System.out.println(isLong.test("Welcome"));   // true

        Function<String, Integer> stringLength = (str1) -> str1.length();
        System.out.println(stringLength.apply("Lambda")); // 6

        Consumer<String> printer = ss1 -> System.out.println("Hello " + ss1);
        printer.accept("World"); // Output: Hello World

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get()); // Random value

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(10, 5)); // true

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(4, 6)); // 10

        BiConsumer<String, Integer> printInfo = (name, age) ->
                System.out.println(name + " is " + age + " years old");
        printInfo.accept("Alice", 30); // Output: Alice is 30 years old

        List<String> names1 = Arrays.asList("Alice", "Bob", "Clara");
        names1.stream()
                .filter(name -> name.length() <= 4)     // Predicate
                .map(name -> name.toUpperCase())       // Function
                .forEach(n -> System.out.println(n));  // Consumer
    }
}
