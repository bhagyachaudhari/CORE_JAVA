package org.example.bitmanipulation;

import java.util.HashMap;

public class PairSumDivByM {

    public static void main(String args[]){
        int[] A = {5,17,100,11};
        int B = 28;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int ans = 0;
        int N = A.length;
        for(int i = 0; i < N; i++){
            A[i] = (A[i] % B);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            if(map.get(A[i]) != null){
                map.put(A[i], map.get(A[i]) + 1);
            }else{
                map.put(A[i], 1);
            }
        }

        Integer freq = map.get(0) == null ? 0 : map.get(0);
        if(freq > 0){
            ans = ans + (freq*(freq-1)/2);
        }

        if(B % 2 == 0){
            freq = map.get(B/2) == null ? 0 : map.get(B/2);
            ans = ans + (freq*(freq-1)/2);
        }

        for(int k = 1; k < ((B+1)/2); k++){
            ans = ans + (map.get(k) == null ? 0 : map.get(k)) * (map.get(B-k) == null ? 0 : map.get(B-k));
        }

        return ans;
    }
}
