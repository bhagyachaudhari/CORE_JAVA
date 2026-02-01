package org.example.arrayexamples;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,5,0,3,2,0,6,0};

        // p1 = 0, p2 != 0
        // p1 != 0, p2 = 0
        // p1 = 0, p2 = 0
        // p1 != 0, p2 != 0

        int p1 = 0;
        int p2 = arr.length-1;

        while(p1 <= p2) {
            if(arr[p1] == 0 && arr[p2] != 0) {
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p2--;
                p1++;
            } else if(arr[p1] != 0 && arr[p2] == 0) {
                p2--;
            } else if(arr[p1] == 0 && arr[p2] == 0) {
                p2--;
            } else {
                p1++;
            }
        }

        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(",")));


        int[] arr1 = new int[]{1,0,5,0,3,2,0,6,0};
        //char[] arr1 = {'a', '0', 'b', '3', '0', 'c', '1'};


        Integer[] result = Stream.concat(
                Arrays.stream(arr).mapToObj(Integer::valueOf).filter(n -> n != 0),
                Arrays.stream(arr).mapToObj(Integer::valueOf).filter(n -> n == 0)
        ).toArray(Integer[]::new);

        System.out.println(Arrays.stream(result).map(String::valueOf).collect(Collectors.joining(",")));


        String str = "I love Java programming";

        String reverse = Arrays.stream(str.split("\\s+")).map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }

}
