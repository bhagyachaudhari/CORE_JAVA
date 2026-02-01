package my.practice.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,-1,7,2,1,-4, 6,9,4,-7, 3,0);

       /* int sum = list.stream().filter(n -> n > 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);*/

        int sum = list.stream().filter(n -> n > 0).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);

    }
}
