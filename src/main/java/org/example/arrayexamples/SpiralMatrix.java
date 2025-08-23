package org.example.arrayexamples;

public class SpiralMatrix {

    public static void main(String args[]){
        int A = 5;
        int[][] output = generateMatrix(A);
        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int A) {

        int[][] output = new int[A][A];

        int s = 0, e = A - 1;
        int number = 0;
        while (A > 1) {

            int rowIndex = s;
            for (int i = s; i < e; i++) {
                output[rowIndex][i] = ++number;
            }

            int colIndex = e;
            for (int i = s; i < e; i++) {
                output[i][colIndex] = ++number;
            }

            rowIndex = e;
            for (int i = e; i > s; i--) {
                output[rowIndex][i] = ++number;
            }

            colIndex = s;
            for (int i = e; i > s; i--) {
                output[i][colIndex] = ++number;
            }

            s++;
            e--;
            A = A - 2;
        }

        if (A == 1) {
            output[s][e] = ++number;
        }
        return output;
    }
}
