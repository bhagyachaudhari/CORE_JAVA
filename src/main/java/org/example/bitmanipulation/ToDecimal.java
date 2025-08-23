package org.example.bitmanipulation;

public class ToDecimal {

    public static void main(String args[]){
        System.out.println(solve(1010, 2));
    }

    public static int solve(int A, int B) {

        int output = 0;
        int numberLength = String.valueOf(A).length();
        int i = 0;
        while(i < numberLength){
            int rem = A % 10;
            output = output + (rem * (int)Math.pow(B, i));
            A = A / 10;
            i++;
        }
        return output;
    }
}
