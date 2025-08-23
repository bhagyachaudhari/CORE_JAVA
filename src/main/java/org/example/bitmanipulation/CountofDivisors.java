package org.example.bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountofDivisors {
    public static void main(String args[]){
        //int[] A = {2, 3, 4, 5};
        int[] A = {8,9,10};
        Arrays.stream(solve(A)).forEach(v->System.out.println(v));
    }
    public static int[] solve(int[] A) {
        int N = A.length;
        int[] factorsCnt = new int[N];
        int maxEle = A[0];
        for(int i = 0; i < N; i++){
            factorsCnt[i] = 1;
            if(A[i] > maxEle){
                maxEle = A[i];
            }
        }
        //create spf array
        int[] spf = new int[maxEle+1];
        for(int i = 1; i <= maxEle; i++){
            spf[i] = i;
        }

        for(int i = 2; i <= maxEle; i++){
            if(spf[i] == i){
                for(int j = i*i; j <= maxEle; j = j+i){
                    if(spf[j] == j)
                        spf[j] = i;
                }
            }
        }


        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            int x = A[i];
            HashMap<Integer, Integer> m = new HashMap<>();
            while(x > 1){
                if(m.get(spf[x]) != null) {
                    m.put(spf[x], m.get(spf[x]) + 1);
                }else {
                    m.put(spf[x], 1);
                }
                x = x / spf[x];
            }
            //factorsCnt[i] = factorsCnt[i] * (map.get(spf[x]) + 1);
            map.put(i, m);
        }
        for(int i = 0; i < N; i++){
            HashMap<Integer, Integer> m = map.get(i);
            for(Map.Entry<Integer, Integer> e : m.entrySet()){
                factorsCnt[i] = factorsCnt[i] * (e.getValue() + 1);
            }
        }
        return factorsCnt;
    }
}
