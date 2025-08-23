package org.example.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

public class LongSubarrayZeroSum {

    public static void main(String args[]) {
        int[] A = {1, -2, 1, 2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        int ans = 0;
        int N = A.length;
        int[] pf = new int[N];
        pf[0] = A[0];
        for (int i = 1; i < N; i++) {
            pf[i] = pf[i - 1] + A[i];
        }

        HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int length = 0;

            if (map.get(pf[i]) != null) {
                HashMap<Integer,Integer> m = map.get(pf[i]);
                int s = 0, e = 0, prevLen = 0;
                for(Map.Entry<Integer, Integer> entry : m.entrySet()){
                    s = entry.getKey() + 1;
                    e = i;
                    prevLen = entry.getValue();
                }
                map.remove(pf[i]);
                if (pf[i] == 0) {
                    length = (i - 0) + 1;
                }else{
                    length = (e-s)+1+prevLen;
                }
                m.put(i, length);
                map.put(pf[i], m);
                if (ans < length)
                    ans = length;

            } else {
                HashMap<Integer,Integer> m = new HashMap();
                if (pf[i] == 0) {
                    length = (i - 0) + 1;
                }else{
                    length = 0;
                }
                m.put(i,length);
                map.put(pf[i], m);
                if (ans < length)
                    ans = length;
            }
        }
        return ans;
    }
}
