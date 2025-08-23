package org.example.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ChangeChar {

    static int[] freq = new int[26];

    public static void main(String args[]){
        String str = "ircvscxggbwkfnqd";
        System.out.println(solve(str, 2));
    }

    public static int solve(String A, int B) {
        if(B == 0 || A.length() == 1)
            return A.length();

        for(int i = 0; i < A.length(); i++){
            int index = (int)A.charAt(i) - 97;
            freq[index]++;
        }

        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < A.length(); i++){
            list.add(A.charAt(i));
        }

        Collections.sort(list, new Comparator<Character>(){

            public int compare(Character x, Character y){
                Integer x_freq = getFreq(x);
                Integer y_freq = getFreq(y);

                if(x_freq < y_freq)
                    return -1;
                else if(x_freq > y_freq)
                    return 1;
                else if(x_freq == y_freq){

                    if(x < y)
                        return -1;
                    else if(x > y)
                        return 1;
                }

                return 0;
            }
        });

        Character[] sortedArr = list.stream().toArray(Character[]::new);

        char maxcountEle = sortedArr[sortedArr.length-1];
        for(int i = 0; i < sortedArr.length; i++){
            freq[(int)sortedArr[i] - 97]--;
            sortedArr[i] = maxcountEle;
            B--;

            if(B == 0)
                break;
        }

        int distinctCnt = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0)
                distinctCnt++;
        }

        return distinctCnt;
    }

    private static int getFreq(char c){
        return freq[(int)c - 97];
    }
}
