package org.example.bitmanipulation;

public class JosephusProblem {
    public static void main(String args[]){
        int A = 8;
        System.out.println(solve(A));
    }
    public static int solve(int A) {

        if(A == getNearestPowerOfTwo(A))
            return 1;

        int number_of_killings = A - getNearestPowerOfTwo(A-1);
        int ans = 1 + 2 * (number_of_killings);
        return ans;
    }

    private static int getNearestPowerOfTwo(int A){
        while(A > 1){
            if((A & (A-1)) == 0)
                return A;
            A--;
        }
        return A;
    }
}
