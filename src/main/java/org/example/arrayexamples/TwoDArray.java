package org.example.arrayexamples;

import java.util.ArrayList;

public class TwoDArray {

    public static void main(String args[]){
       /* int[][] A = {
                {520, 97, 526, 108, 798},
                {571, 349, 682, 782, 277},
                {547, 91, 393, 250, 553},
                {267, 330, 185, 722, 683},
                {34, 591, 92, 215, 304},
                {116, 967, 102, 16, 608},
                {242, 536, 706, 768, 996},
                {504, 691, 345, 538, 473},
                {975, 85, 916, 720, 687},
                {470, 987, 369, 7, 709}
        };

        System.out.println("column wise sum = " + solve(A));
        System.out.println("row wise sum = " + solveRowWiseSum(A));
        System.out.println(solveMulti(A, 4));*/

        int[][] A = {
                {51, 21, 90, 38, 57, 12, 11, 1,  68, 60},
                {81, 24, 63, 97, 75, 70, 23, 91, 39, 84},
                {0,  21, 97, 12, 46, 48, 50, 3,  57, 69},
                {44, 8,  42, 34, 99, 0,  98, 10, 53, 67},
                {23, 34, 43, 86, 31, 18, 9,  54, 61, 48},
                {90, 61, 21, 87, 26, 67, 88, 28, 70, 45},
                {98, 14, 5,  92, 1,  4,  44, 99, 67, 98},
                {18, 42, 32, 61, 80, 64, 32, 89, 70, 93},
                {89, 61, 7,  10, 0,  85,  9, 40, 13, 0},
                {85, 63, 66, 43, 56, 67, 99, 0,  67, 66}
        };
        rowToColumnZero(A);

        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[] solve(int[][] A) {

        int[] output = new int[A[0].length];
        for(int i = 0; i < A[0].length; i++){
            int sum = 0;
            for(int j = 0; j < A.length; j++){
                sum = sum + A[j][i];
            }
            output[i] = sum;
        }
        return output;

    }

    public static int[] solveRowWiseSum(int[][] A) {

        int[] output = new int[A.length];
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = 0; j < A[0].length; j++){
                sum = sum + A[i][j];
            }
            output[i] = sum;
        }
        return output;

    }

    public static int[][] solveMulti(int[][] A, int B) {
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = B * A[i][j];
            }
        }
        return A;
    }

    public static void rowToColumnZero(int[][] A){
        ArrayList<Integer> lastNullColumn = new ArrayList<>();
        ArrayList<Integer> lastNullRow = new ArrayList<>();

        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if(A[i][j] == 0){
                    lastNullRow.add(i);
                    lastNullColumn.add(j);
                }
            }
        }

        for(int i = 0; i < lastNullRow.size(); i++){
            // 0th row, 0,1,2,3..columns
            int index = 0;

            while(index < A[lastNullRow.get(i)].length){
                A[lastNullRow.get(i)][index] = 0;
                index++;
            }

            // 1st column, 0,1,2,3..rows
            index = 0;
            while(index < A.length) {
                A[index][lastNullColumn.get(i)] = 0;
                index++;
            }
        }
    }
}
