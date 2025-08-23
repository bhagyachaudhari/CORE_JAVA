package org.example.arrayexamples;

import java.util.ArrayList;
import java.util.Collections;

public class TwoDSubArray {

    public static void main(String args[]){
        int[] A = {1,2,3};
        int[][] output = solve(A);
        for(int i = 0; i < output.length; i++){
            for(int j = 0; j < output[i].length; j++){
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[] A) {
        int N = A.length;
        int NS = N * (N + 1) / 2;
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        //int[][] output = new int[NS][N];
        //int rowIndex = -1;
        //int colIndex = -1;
        for (int s = 0; s < N; s++) {
            for (int e = s; e < N; e++) {
                //++rowIndex;
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = s; i <= e; i++) {
                    list.add(A[i]);
                }
                output.add(list);
                //colIndex = -1;
            }
        }
        return output.stream().map(l -> l.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
    }
}
