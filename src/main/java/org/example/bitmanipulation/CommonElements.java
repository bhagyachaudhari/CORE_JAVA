package org.example.bitmanipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElements {

    public static void main(String args[]){
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};
        Arrays.stream(solve(A, B)).forEach((v)->System.out.println(v));
    }
    public static int[] solve(int[] A, int[] B) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < B.length; i++){
            if(map.get(B[i]) != null){
                map.put(B[i], map.get(B[i]) + 1);
            }else{
                map.put(B[i], 1);
            }
        }

        for(int i = 0; i < A.length; i++){
            if(map.get(A[i]) != null){
                output.add(A[i]);
                map.put(A[i], map.get(A[i])-1);
                if(map.get(A[i]) == 0)
                    map.remove(A[i]);
            }
        }

        int[] result = new int[output.size()];
        for(int i = 0; i < output.size(); i++){
            result[i] = output.get(i);
        }
        return result;
    }
}

