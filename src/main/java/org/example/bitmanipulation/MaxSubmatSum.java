package org.example.bitmanipulation;

public class MaxSubmatSum {

    public static void main(String args[]){
        int[][] A = {{-5,-4,-3}, {-1,2,3}, {2,2,4}};
        System.out.println(solve(A));
    }

    public static long solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        long ans = Integer.MIN_VALUE;
        long pfSum[][] = new long[N][M];

        if(N == 1 && M == 1)
            return A[0][0];

        for(int k = 0; k < A.length; k++){
            pfSum[k][0] = A[k][0];
        }
        for(int r = 0; r < N; r++){
            for(int c = 1; c < M; c++){
                pfSum[r][c] = pfSum[r][c-1] + A[r][c];
            }
        }

        for(int r = 1; r < N; r++){
            for(int c = 0; c < M; c++){
                pfSum[r][c] = pfSum[r-1][c] + pfSum[r][c];
            }
        }

        int a2 = N-1;
        int b2 = M-1;
        for(int i = 0; i <= a2; i++){
            for(int j = 0; j <= b2; j++){
                int a1 = i;
                int b1 = j;
                long sum = (pfSum[a2][b2]) - (a1 > 0 ? pfSum[a1-1][b2] : 0) - (b1 > 0 ? pfSum[a2][b1-1] : 0) + (((a1 > 0) && (b1 > 0)) ? pfSum[a1-1][b1-1] : 0);
                ans = (sum > ans) ? sum : ans;
            }
        }
        return (int)ans;

    }
}
