package org.example.java9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) throws IOException {
        Stream.of(1, 2, 3, 4, 5)
                .takeWhile(n -> n < 4)
                .forEach(System.out::println); // prints 1 2 3

        Optional optional = Optional.of(1);
        optional.ifPresentOrElse(
                val -> System.out.println("Value: " + val),
                () -> System.out.println("Empty")
        );
        Optional optional1 = Optional.empty();
        optional1.ifPresentOrElse(
                val -> System.out.println("Value: " + val),
                () -> System.out.println("Empty")
        );

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try (br) {
            // use br
        }

        List<String> list = List.of("a", "b", "c");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> map = Map.of("a", 1, "b", 2);
    }
}
