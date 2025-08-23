package org.example.bitmanipulation;

import java.util.Arrays;

public class Flip {
    public static void main(String args[]){
        Arrays.stream(flip("0111000100010")).forEach((v)->System.out.println(v));
    }
    public static int[] flip(String A) {
        int onesCnt = 0;
        char ar[] = A.toCharArray();
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == '1')
                onesCnt++;
        }


        int[] resArr = new int[2];
        int sum = onesCnt;
        int ans = onesCnt;
        boolean flag = false;
        int a = 0;
        int b = -1;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == '0'){
                sum++;
                if(sum <= onesCnt){
                    sum = onesCnt + 1;
                    a = i;
                    b = b + 1;
                }else {
                    //a = i;
                    b = i;
                }
                flag = true;
            }else{
                sum--;
                b = i;
            }

            if(sum > ans) {
                ans = sum;
                resArr[0] = a+1;
                resArr[1] = b+1;
            }
        }

        return flag ? resArr : new int[]{};
    }
}
