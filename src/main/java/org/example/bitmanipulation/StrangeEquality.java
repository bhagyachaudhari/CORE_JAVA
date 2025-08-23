package org.example.bitmanipulation;

import java.util.*;

public class StrangeEquality {

    public static void main(String args[]){
        String A = "ADOBECODEBANC";
        String B = "ABC";
        System.out.println(minWindow(A, B));
    }
    public static String minWindow(String A, String B) {

        HashMap<Character, Integer> freq_A = new HashMap<>();
        HashMap<Character, Integer> freq_B = new HashMap<>();

        if(B.length() == 1 && A.length() == 1){
            if(A.equals(B))
                return B;
            else
                return "";
        }


        int N = B.length();
        int M = A.length();
        for(int i = 0; i < 26; i++){
            freq_A.put((char)(65+i), 0);
            freq_A.put((char)(97+i), 0);
            freq_B.put((char)(65+i), 0);
            freq_B.put((char)(97+i), 0);
        }

        for(int i = 0; i < 10; i++){
            freq_A.put((char)(48+i), 0);
            freq_B.put((char)(48+i), 0);
        }

        for(int i = 0; i < N; i++){
            freq_B.put(B.charAt(i), freq_B.get(B.charAt(i))+1);
        }

        String ans = "";
        int s = 0, e = 0, minStartIndex = A.length()-1, minLength = A.length();
        freq_A.put(A.charAt(0), freq_A.get(A.charAt(0))+1);

        while(e < M){
            if(check(freq_A, freq_B)){
                int length = (e-s)+1;
                if(length < minLength){// && s < minStartIndex) {
                    ans = A.substring(s, e+1);
                    //minStartIndex = s;
                    minLength = length;
                }
                freq_A.put(A.charAt(s), freq_A.get(A.charAt(s))-1);
                s++;
            }else{
                e++;
                if(e == M)
                    break;

                freq_A.put(A.charAt(e), freq_A.get(A.charAt(e))+1);
            }
        }

        return ans;
    }

    public static boolean check(HashMap<Character, Integer> freq_A, HashMap<Character, Integer> freq_B){
        for(int i = 0; i < 26; i++){
            if(freq_B.get((char)(97+i)) > freq_A.get((char)(97+i))){
                return false;
            }
            if(freq_B.get((char)(65+i)) > freq_A.get((char)(65+i))){
                return false;
            }
        }

        for(int i = 0; i < 10; i++) {
            if (freq_B.get((char) (48 + i)) > freq_A.get((char) (48 + i))) {
                return false;
            }
        }
        return true;
    }
}

