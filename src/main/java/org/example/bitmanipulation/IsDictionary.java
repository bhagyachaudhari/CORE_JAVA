package org.example.bitmanipulation;

import java.math.BigInteger;
import java.util.HashMap;

public class IsDictionary {

    public static void main(String args[]){
        String[] A = {"ipial", "qjqgt", "vfnue", "vjqfp", "eghva", "ufaeo", "atyqz", "chmxy", "ccvgv", "ghtow"};
        String B = "nbpfhmirzqxsjwdoveuacykltg";
        System.out.println(solve(A, B));
    }

    public static int solve(String[] A, String B) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < B.length(); i++){
            map.put(B.charAt(i), i); //<a,0>, <d,1>
        }

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < A.length; i++){
            str.append(A[i] + "-"); //hello-scaler-interviewbit-
        }

        str.deleteCharAt(str.length()-1);

        int indexSum = 0;
        int index = -1;
        HashMap<Integer, Integer> mapNumberSum = new HashMap<>();
        for(int i = 0; i < str.toString().length(); i++){
            indexSum = indexSum + (map.get(str.toString().charAt(i)) == null ? 0 : map.get(str.toString().charAt(i)));

            if(str.toString().charAt(i) == '-'){
                mapNumberSum.put(++index, indexSum);
                indexSum = 0;
            }
        }

        for(int i = 1; i < A.length; i++){
            if(map.get(A[i-1].charAt(0)) > map.get(A[i].charAt(0)))
                return 0;

            if((map.get(A[i-1].charAt(0)) == map.get(A[i].charAt(0)))){
                if(A[i-1].length() > A[i].length())
                    return 0;
                else if(A[i-1].length() == A[i].length()){
                    if(mapNumberSum.get(i-1).compareTo(mapNumberSum.get(i)) == 1)
                        return 0;
                }

            }
        }
        return 1;
    }
}
