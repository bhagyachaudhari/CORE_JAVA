package org.example.bitmanipulation;

public class InterestingArray {

    public static void main(String[] args){
        int[] A = {9, 17};
        System.out.println(solve(A));
    }

    public static String solve(int[] A) {

        int bit = A[0] % 2 == 0 ? 0 : 1;//1
        for(int i = 1; i < A.length; i++){
            if(A[i] % 2 == 0)
                bit = bit ^ 0;
            else
                bit = bit ^ 1;
        }

        if(bit == 0)
            return "Yes";
        else
            return "No";
    }
}
