package org.example.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBreakDemo {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("interview");
        list.add("my");
        list.add("trainer");
        System.out.println(wordBreak("myinterviewtrainer", list));
    }
    public static int wordBreak(String A, ArrayList<String> B) {

        return breakSentence(A, B) ? 1 : 0;
    }

    public static boolean breakSentence(String A, ArrayList<String> B){

        if(A.length() == 0)
            return true;

        for(int i = 0 ; i < A.length(); i++){
            String substr = A.substring(0, i+1);
            if(B.contains(substr)){
                if(breakSentence(A.substring(i+1), B))
                    return true;
            }
        }
        return false;
    }
}
