package org.example.bitmanipulation;

public class CountIncreasingTriplets {
    public static void main(String args[]){
        int[] A = {26, 23, 23, 16, 27, 18, 7};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {

        int N = A.length;
        int ans = 0;
        for(int j = 0; j < N; j++){
            int count_i = 0;
            int count_k = 0;
            for(int i = j - 1; i >= 0; i--){
                if(A[i] < A[j])
                    count_i++;
            }

            for(int k = j + 1; k < N; k++){
                if(A[k] > A[j])
                    count_k++;
            }

            ans = ans + (count_i * count_k);
        }

        return ans;
    }
}
