package org.example.bitmanipulation;

public class BitwiseSubArrayOR {

    public static void main(String args[]){
        //int[] B = {1, 0, 1};
        //System.out.println(solve(3, B));
        //int[] B = {1, 0};
        //System.out.println(solve(2, B));
        //int[] B = {1};
        //System.out.println(solve(1, B));
        int[] B = {0, 1, 1, 0, 1};
        System.out.println(solve(5, B));
        //int[] B = {1, 0, 0, 1, 1, 1, 1, 1, 1};
        //System.out.println(solve(9, B));
    }

    public static long solve(int A, int[] B) {
        long total = 0;
        int count = 0;
        for(int i =0;i<A;i++){
            if(B[i] == 1)
                count = i+1;

            total = total + count;
        }

        return total;
    }
}
