package org.example.bitmanipulation;

import java.util.HashMap;

public class CountSubarrayZeroSum {

    public static void main(String args[]){
        int[] A = {30, -30, 30, -30};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        if(A.length == 1 && A[0] == 0)
            return 1;

        long count = 0;
        int N = A.length;
        long[] pf = new long[N];
        pf[0] = A[0];
        for(int i = 1; i < N; i++){
            pf[i] = pf[i-1] + A[i];
        }

        HashMap<Long, Long> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            if(map.get(pf[i]) != null){
                if(pf[i] == 0)
                    count = count + 1;
                long prevFreq = map.get(pf[i]);
                long freq = map.get(pf[i]) + 1;
                map.put(pf[i], freq);
                count =  (count + prevFreq) % 1000000007;
            }else{
                map.put(pf[i], 1L);
                if(pf[i] == 0)
                    count = count + 1;
            }
        }

        return (int)count;
    }
}

