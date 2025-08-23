package org.example.bitmanipulation;

import java.util.Arrays;

public class ChangeChar2 {

    public static void main(String args[]){
        String str = "ircvscxggbwkfnqd";
        solve(str, 2);
    }

    public static int solve(String A, int B) {

        char[] arr = A.toCharArray();
        int[] freq = new int[26];
        for(int i = 0; i < arr.length; i++){
            int index = (int)arr[i] - 97;
            freq[index]++;
        }

        int maxcount = freq[0];
        char maxcountEle = 'a';

        for(int i = 0; i < 26; i++){
            if(maxcount < freq[i]){
                maxcount = freq[i];
                maxcountEle = (char)(97 + i);
            }
        }


        int distinctCnt = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0)
                distinctCnt++;
        }

        return distinctCnt;
    }
}
