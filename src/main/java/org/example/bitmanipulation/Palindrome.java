package org.example.bitmanipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Palindrome {

    public static void main(String args[]){
        System.out.println(solve("aabcb"));
    }

    public static int solve(String A) { //aabcb

        char[] arr = A.toCharArray(); //[a,a,b,c,b]

        HashMap<Character, List<Integer>> map = new HashMap<>(); // <a, [0, 1]>, <b, [2,4]>, <c, [3]>
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) != null){
                List<Integer> list = map.get(arr[i]);
                list.add(i);
                map.put(arr[i], list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
            }

        }

        int s = 0; //0
        int e = arr.length-1; //4

        while(s < e){ // 0 < 4
            if(arr[s] != arr[e]){ // a!=b
                if(map.get(arr[s]).size() > 1){
                    map.get(arr[s]).remove(Integer.valueOf(s));
                    int nextIndex = map.get(arr[s]).get(0);

                    char temp = arr[e];

                    List<Integer> list = map.get(arr[e]);
                    list.remove(Integer.valueOf(e));
                    list.add(nextIndex);
                    map.put(arr[e], list);
                    arr[e] = arr[nextIndex];

                    list = map.get(arr[nextIndex]);
                    list.remove(Integer.valueOf(nextIndex));
                    list.add(e);
                    map.put(arr[nextIndex], list);
                    arr[nextIndex] = temp;

                }else if(map.get(arr[e]).size() > 1){
                    map.get(arr[e]).remove(Integer.valueOf(e));
                    int nextIndex = map.get(arr[e]).get(0);

                    char temp = arr[s];

                    List<Integer> list = map.get(arr[s]);
                    list.remove(Integer.valueOf(s));
                    list.add(nextIndex);
                    map.put(arr[s], list);
                    arr[s] = arr[nextIndex];

                    list = map.get(arr[nextIndex]);
                    list.remove(Integer.valueOf(nextIndex));
                    list.add(s);
                    map.put(arr[nextIndex], list);
                    arr[nextIndex] = temp;
                }
            }
            s++;
            e--;
        }

        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            newStr.append(arr[i]);
        }

        StringBuilder revStr = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            revStr.append(arr[i]);
        }

        if(newStr.toString().equals(revStr.toString()))
            return 1;
        else
            return 0;

    }
}
