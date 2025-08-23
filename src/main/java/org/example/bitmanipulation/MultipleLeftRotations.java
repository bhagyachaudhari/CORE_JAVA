package org.example.bitmanipulation;

public class MultipleLeftRotations {
    public static void main(String args[]){
        int[] A = {6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47};
        int[] B = {88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};
        //int[] A = {1, 2, 3, 4, 5};
        //int[] B = {7, 8};
        System.out.println(solve(A, B));
    }

    public static int[][] solve(int[] A, int[] B) {

        int[][] output = new int[B.length][A.length];
        //Reverse array
        int N = A.length;
        reverse(0, N-1, A);
        for(int i = 0; i < B.length; i++){
            int[] temp = new int[A.length];
            copyArray(temp, A);
            int P1 = B[i] > N ? N - getIndex(B[i], N) : N - B[i];

            reverse(0, P1-1, temp);
            reverse(P1, N-1, temp);

            createAnsArray(output, temp, i);
        }

        return output;
    }

    private static void reverse(int i, int j, int[] A){
        while(i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    private static int getIndex(int B, int N){
        int index = B;
        while(index > N){
            index = index % N;
        }
        return index;
    }

    private static void copyArray(int[] temp, int[] A){
        for(int i = 0; i < A.length; i++){
            temp[i] = A[i];
        }
    }

    private static void createAnsArray(int[][] output, int[] temp, int rowIndex){
        for(int i = 0; i < temp.length; i++){
            output[rowIndex][i] = temp[i];
        }
    }
}
