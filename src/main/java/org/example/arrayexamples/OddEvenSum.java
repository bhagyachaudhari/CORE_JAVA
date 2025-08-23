package org.example.arrayexamples;

public class OddEvenSum {

    public static void main(String args[]){
        int[] A = {1, 2, 3, 7, 1, 2, 3};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int N = A.length;
        int[] pfSumEven = new int[N];
        int[] pfSumOdd = new int[N];
        getOddEvenPfSumArray(A, N, pfSumEven, pfSumOdd);
        int count = 0;

        for(int k = 0; k < N; k++){
            //even
            int evenIndicesSum = (k == 0) ? 0 + (pfSumOdd[N-1] - pfSumOdd[k])
                    : pfSumEven[k-1] + (pfSumOdd[N-1] - pfSumOdd[k]);

            //odd
            int oddIndicesSum = (k == 0) ? 0 + (pfSumEven[N-1] - pfSumEven[k])
                    : pfSumOdd[k-1] + (pfSumEven[N-1] - pfSumEven[k]);

            if(evenIndicesSum == oddIndicesSum)
                count++;
        }

        return count;
    }

    private static void getOddEvenPfSumArray(int[] A, int N, int[] pfSumEven, int[] pfSumOdd){
        pfSumEven[0] = A[0];
        pfSumOdd[0] = 0;
        for(int i = 1; i < N; i++){
            if(i%2 == 0){
                pfSumEven[i] = pfSumEven[i-1] + A[i];
                pfSumOdd[i] = pfSumOdd[i-1];
            }else{
                pfSumEven[i] = pfSumEven[i-1];
                pfSumOdd[i] = pfSumOdd[i-1] + A[i];
            }
        }
    }
}
