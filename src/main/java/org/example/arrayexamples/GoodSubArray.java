package org.example.arrayexamples;

public class GoodSubArray {
    public static void main(String args[]){
        int[] A = {15, 8, 16};
        int B = 242;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int N = A.length;
        getpfSumArray(A, N);
        int count = getSubArraysCount(A, N, B);
        return count;
    }

    private static int getSubArraysCount(int[] A, int N, int B) {
        int sum, count = 0;
        for(int s = 0; s < N; s++){
            for(int e = s; e < N; e++){
                sum = (s == 0) ? A[e] : A[e] - A[s-1];
                if((e-s+1) % 2 == 0){
                    if(sum < B){
                        count++;
                    }
                }else if((e-s+1) % 2 != 0){
                    if(sum > B){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static void getpfSumArray(int[] A, int N) {
        for(int  i = 1; i < N; i++){
            A[i] = A[i-1] + A[i];
        }
    }
}
