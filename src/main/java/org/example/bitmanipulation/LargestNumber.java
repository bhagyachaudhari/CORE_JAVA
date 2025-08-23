package org.example.bitmanipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

    public static void main(String args[]){
        List<Integer> A = Arrays.asList(3, 30, 34, 5, 9);
        System.out.println(largestNumber(A));
        System.out.println(A);

    }


    public static String largestNumber(final List<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){

            public int compare(Integer x, Integer y){

                String xy = x+""+y;
                String yx = y+""+x;

                if(xy.equals(yx))
                    return 0;
                else
                    return yx.compareTo(xy);
            }
        });

        String output = "";
        for(int i = 0; i < A.size(); i++){
            output = output + A.get(i);
        }
        return output;
    }
}
