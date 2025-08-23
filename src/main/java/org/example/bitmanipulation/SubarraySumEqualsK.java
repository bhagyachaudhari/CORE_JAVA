package org.example.bitmanipulation;

import java.util.*;

public class SubarraySumEqualsK {

    public static void main(String args[]){
        int[] A = {19, -10, -13, 10, -13, 6, 7, 2, 18, -19, -4};
        int B = 19;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {

        int N = A.length;
        int count = 0;
        for(int i = 1; i < N; i++){
            A[i] = A[i-1] + A[i];
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            if(map.get(A[i]) != null){
                List<Integer> list = map.get(A[i]);
                list.add(i);
                map.put(A[i], list);
            }else{
                List<Integer> list = new ArrayList();
                list.add(i);
                map.put(A[i], list);
            }
        }

        for(int i = 0; i < N; i++){
            int pfSumOfR = B + ((i == 0) ? 0 : A[i-1]);
            List<Integer> list = map.get(pfSumOfR);
            if (list != null){
                for(Integer index : list)
                    count = (index >= i) ? count + 1 : count;
            }
        }

        return count;
    }
}
