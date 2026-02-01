package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,7,12,31,15,22,17,20,25,19);

        System.out.println(list.stream().filter(n -> n/10 == 1).collect(Collectors.toList()));

        List<Integer> list1 = Arrays.asList(132,154,176,187,198,321, 456);
        System.out.println(132/100); //13
        System.out.println(132%10); //2
        System.out.println((132%100)/10); // 32/10 = 3

        System.out.println(list1.stream().filter(n ->(n>= 100 && n <= 200) && (n/100 + n%10) == (n%100)/10).collect(Collectors.toList()));
        IntStream.rangeClosed(100, 200).filter(n ->(n/100 + n%10) == (n%100)/10).forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(0,1,1,1,1,1,0,0,0,1,0,1,1,0,1);

    }
}
