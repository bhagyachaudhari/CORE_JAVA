package org.example.bitmanipulation;

public class Divisibility {

    public static void main(String args[]){
        //int[] A = {1, 2, 3};
        int[] A = {5, 6, 6, 5, 5, 2, 0, 4, 6, 4};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        int N = A.length;
        int number = 0;
        int t = 1;

        for(int i = N-1; i >=0; i-- ){
            number = number + A[i] * t;
            t = t * 10;
        }

        if(number % 3 == 0)
            return 1;
        else
            return 0;
    }
}
