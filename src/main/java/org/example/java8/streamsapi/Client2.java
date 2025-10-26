package org.example.java8.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;


public class Client2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,2,3,8,9);
        Stream<Integer> streamList = list.stream();
        Stream<Integer> streamList2 = Stream.of(3,5,6);
        IntStream intStream = IntStream.range(1,10);
        //intStream.forEach(a-> System.out.println(a));
        IntStream intStream2 = IntStream.rangeClosed(1,10);
        //intStream2.forEach(a-> System.out.println(a));
        IntStream intStream1 = IntStream.of(2,32,2);
        DoubleStream doubleStream = DoubleStream.of(3,4,2.5,4.9);
        LongStream longStream = LongStream.of(3L, 4L);

        String[] array = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(array);

        int[] array1 = {1, 5, 3};
        Arrays.stream(array1).forEach(n -> System.out.println(n));

        Stream<String> stream2 = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();

        Map<Integer, List<String>> grouped = stream.collect(
                Collectors.groupingBy(String::length));
    }
}
