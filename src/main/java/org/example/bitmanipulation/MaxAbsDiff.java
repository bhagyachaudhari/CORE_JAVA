package org.example.bitmanipulation;

public class MaxAbsDiff {

    public static void main(String args[]){
        System.out.println(maxArr(new int[]{1, 3, -1}));
    }
    public static int maxArr(int[] A) {

        int x_max = Integer.MIN_VALUE;
        int x_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;
        for(int i = 0; i < A.length; i++){
            x = A[i] + i;
            if(x > x_max)
                x_max = x;
            if(x < x_min)
                x_min = x;

            y = A[i] - i;
            if(y > y_max)
                y_max = y;
            if(y < x_min)
                y_min = y;
        }

        x = x_max - x_min;
        y = y_max - y_min;
        return x > y ? x : y;
    }
}
