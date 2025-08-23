package org.example.bitmanipulation;


public class DecimalToAnyBase {
    public static void main(String args[]){
        System.out.println(solve(4, 3));
    }
    public static int solve(int A, int B) {
        int d = (int) Math.floor(A / B);
        int q = A - (B * d);
        A = d;
        String output = q+"";
        while(d > 0){
            d = (int) Math.floor(d / B);
            q = A - (B * d);
            output = q + output;
            A = d;
        }
        return Integer.parseInt(output);
    }
}
