package org.example.bitmanipulation;

public class XORSum {
    public static void main(String args[]){
        //System.out.println(solve(2, 1));
        System.out.println((6 ^ 4) + (12 ^ 4));

        System.out.println((6 ^ 6) + (12 ^ 6));

        System.out.println((6 ^ 12) + (12 ^ 12));

        System.out.println((6 ^ 0) + (12 ^ 0));
    }

    public static int solve(int A, int B) {
        int ans = A + B; //3
        int X = 0;
        int minNumber = A < B ? A : B; //1
        while(X <= minNumber){ //0 <= 1, 1<= 1
            int sum = (A ^ X) + (B ^ X); //3, 5
            if(sum < ans)
                ans = sum;
            X++;//1
        }
        return ans;
    }
}
