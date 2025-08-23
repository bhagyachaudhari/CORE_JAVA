package org.example.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArraySum {

    public static void main(String args[]){
        int[] A = {1, 2, 3, 4, 5};
        int B = 5;
        Arrays.stream(solve(A, B)).forEach((v)->System.out.println(v));
    }

    public static int[] solve(int[] A, int B) {

        int N = A.length;
        HashMap<Long, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        long[] pf = new long[A.length];
        int[] output = new int[]{-1};

        pf[0] = A[0];
        for(int i = 1; i < N; i++){
            pf[i] = pf[i-1] + A[i];
        }

        for(int k = 0; k < N; k++){
            int s = k, e = k;
            while(e < N){
                long sum = pf[e] - ((s == 0) ? 0 : pf[s-1]);
                if(sum == B){
                    map.put(sum, s+"-"+e);
                    break;
                }
                e++;
            }
            if(!map.isEmpty())
                break;
        }

        if(map.isEmpty())
            return output;
        else{
            String str = map.get((long)B);
            String[] index = str.split("-");
            for(int i = Integer.parseInt(index[0]); i <= Integer.parseInt(index[1]); i++)
                list.add(A[i]);

            output = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                output[i] = list.get(i);
            }
        }
        return output;
    }


}
