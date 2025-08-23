package org.example.bitmanipulation;

import java.util.Arrays;
import java.util.Collections;

public class ElementsRemoval {

    public static void main(String args[]){
        int[] A = {2, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        //Arrays.sort(A, Collections.reverseOrder());
        int cost = 0;
        for(int i = 0; i < A.length; i++){
            cost = cost + A[i] * (i+1);
        }
        return cost;

    }
}
