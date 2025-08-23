package org.example.bitmanipulation;

public class MaxNumOnes {

    public static void main(String args[]){
        int[][] A = {{0, 0, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1}};
        System.out.println(solve(A));
    }

    public static int solve(int[][] A) {
        int N = A.length;
        int maxSum = 0;
        int ans = 0;
        //int r = -1;
        int sum = 0;
        int j = 0;
        for(int i = N-1; i >= 0; i--){
            if(A[j][i] == 1)
                sum++;

            if(i == 0 && j < N){
                if(sum > maxSum) {
                    ans = j;
                    maxSum = sum;
                }
                sum = 0;
                j++;
                i = j == N ? -1 : N;
            }

        }

        return ans;


    }
}
