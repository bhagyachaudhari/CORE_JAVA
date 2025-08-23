package org.example.arrayexamples;

public class Profit {

    public static void main(String args[]){
        int[] A = new int[]{2, 1};
        System.out.println(maxProfit(A));
    }
    public static int maxProfit(final int[] A) {
        return A.length > 0 ? getMax(A) - getMin(A) : 0;
    }

    private static int getMax(int[] A){
        int max = A[0];
        for(int i=1; i<A.length; i++){
            if(A[i] > max)
                max = A[i];
        }
        return max;
    }

    private static int getMin(int[] A){
        int min = A[0];
        for(int i=1; i<A.length; i++){
            if(A[i] < min)
                min = A[i];
        }
        return min;
    }

}
