package my.practice.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        //long count = Arrays.stream(arr).filter(n->n == 0).mapToObj(n -> (int)n).count();
        long count = Arrays.stream(arr).filter(n->n == 0).count();
        //System.out.println(count); //2


        List<Integer> list = Arrays.stream(arr).mapToObj(Integer::valueOf).filter(n -> n != 0).collect(Collectors.toList());

        while(count > 0) {
            list.add(0);
            count--;
        }

        list.stream().forEach(System.out::println);


        // Output: [1, 3, 12, 0, 0]

    }
}
