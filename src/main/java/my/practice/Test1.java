package my.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        try {
            String s = null;
            //System.out.println(s.length());
            //int div = 10/0;
            //System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println("A");
        } finally {
            System.out.println("B");
        }
        System.out.println("C");


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6, 3);
        Set<Integer> set = new LinkedHashSet<>();
        numbers.stream().filter(i -> !set.add(i)).forEach(System.out::println);

        //display(null);
        display(1);
    }

    public static void display(String s) {
        System.out.println("String call");
    }

    public static void display(Integer i) {
        System.out.println("Integer call");
    }

    public static void display(Object o) {
        System.out.println("object call");
    }

}
