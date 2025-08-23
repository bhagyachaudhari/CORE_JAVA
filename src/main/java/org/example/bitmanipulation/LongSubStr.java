package org.example.bitmanipulation;

public class LongSubStr {

    public static void main(String args[]){
        System.out.println(longestPalindrome("aaaabaaa"));
    }
    public static String longestPalindrome(String A) {

        if(A == null || A.length() == 0)
            return "";

        char[] arr = A.toCharArray();
        int N = arr.length;
        String ans = "";
        int maxStrLength = 0;
        String subStr = "";
        for(int i = 0; i < N; i++){
            int p1 = i, p2 = i;
            subStr = expand(A, p1, p2, "odd");
            ans = subStr.length() > maxStrLength ? subStr : ans;
            maxStrLength = ans.length();
        }

        for(int i = 0; i < N-1; i++){
            int p1 = i, p2 = i+1;
            subStr = expand(A, p1, p2, "even");
            ans = subStr.length() > maxStrLength ? subStr : ans;
            maxStrLength = ans.length();
        }

        return ans;
    }

    private static String expand(String A, int p1, int p2, String type){
        boolean flag = false;
        while(A.charAt(p1) == A.charAt(p2) && p1 >= 0 && p2 < A.length()){
            p1--;
            p2++;

            if(p1 < 0 || p2 > A.length()-1)
                return A.substring(p1+1, p2);

            flag = true;
        }

        if(flag)
            return A.substring(p1+1, p2);

        return "";
    }
}

