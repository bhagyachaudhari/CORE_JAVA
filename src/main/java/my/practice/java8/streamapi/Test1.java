package my.practice.java8.streamapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,5,3,7,8,4);
        s.limit(2).forEachOrdered(System.out::println);
        //s.forEachOrdered(System.out::println);
        //s.forEach(System.out::println);

        /*Path path = Paths.get("data.txt");
        try(Stream<String> lines = Files.lines(path)) {
            lines.collect(Collectors.toList()).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        Predicate<String> p = (str) ->str.equals("test");
        System.out.println(p.test("test1"));

        IntStream.range(1, 10).forEach(System.out::println);

        IntStream.range(1, 5).boxed() //boxing
                .collect(Collectors.toList()); // ERROR


        Stream.of(5,6,3,24,8).unordered().forEach(System.out::println);


        List<Integer> list = Arrays.asList(1, 2, 3);

        int sum = list.stream()
                .mapToInt(Integer::intValue) // unboxing
                .sum();
        System.out.println(sum);

        double avg = list.stream()
                .mapToInt(Integer::intValue) // unboxing
                .average().getAsDouble();
        System.out.println(avg);


        Supplier<Integer> sup = ()->{
            return 1000000;
        };
        System.out.println(sup.get());

        Consumer<Character> cons = (ch)->{
            System.out.println(ch);
        };
        cons.accept('A');

    }
}
