package org.example.arrayexamples;

public class BothSidesSum {

    public static void main(String args[]){
        int[] A = {-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587};
        int B = 81;
        //int[] A = { 2, 3, -1, 4, 2, 1};
        //int B = 4;
        int N = A.length;
        int maxSum = 0;
        for(int ele = 0; ele < B; ele++) {
            maxSum = maxSum + A[ele];
        }

        for(int i = 0; i<=B; i++){
            int sum = getSum(i, B-i, A, N);
            if(maxSum < sum)
                maxSum = sum;
        }
        System.out.println(maxSum);
    }
    public static int getSum(int leftElements, int rightElements, int[] A, int N){
        int sum = 0;
        for(int i = 0; i<leftElements; i++){
            sum = sum + A[i];
        }
        for(int j = N-1; j >= N-rightElements; j--){
            sum = sum + A[j];
        }
        return sum;
    }

}
