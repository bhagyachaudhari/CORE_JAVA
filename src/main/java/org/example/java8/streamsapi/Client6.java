package org.example.java8.streamsapi;

import java.util.Arrays;
import java.util.List;

public class Client6 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,7,1,9,3,8,2);
        int num = list.stream().reduce((a,b)->a+b).get();
        System.out.println(num);

        int num7 = list.stream().reduce(Integer.MIN_VALUE, Math::max).intValue();
        System.out.println(num7);

        int num8 = list.stream().reduce(Integer::sum).get();
        System.out.println(num8);

        int num1 = list.stream().reduce((a,b)->b).get();
        System.out.println(num1);

        int num2 = list.stream().reduce((a,b)->a).get();
        System.out.println(num2);

        int num3 = list.stream().reduce(0, (a,b)->a+b).intValue();
        System.out.println(num3);
        int num4 = list.stream().reduce(1, (a,b)->a*b).intValue();
        System.out.println(num4);

        int num5 = list.stream().reduce((a,b) -> a < b ? a : b).get();
        System.out.println(num5);

        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E");
        String str = list1.stream().reduce((a,b)->a+"-"+b).get();
        System.out.println(str);

        int sum1 = list1.parallelStream().reduce(0,
        (sum, word) -> sum + word.length(),
                Integer::sum
        ).intValue();

        System.out.println(sum1);
    }
}
