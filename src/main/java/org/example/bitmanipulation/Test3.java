package org.example.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

    public static void main(String args[]){
        int A = 3;
        int B = 2;
        int[][] C =  { {7, 3}, {2, 1}, {4, 9} };
        System.out.println(solve(A, B, C));
    }

    public static int solve(int A, int B, int[][] C) {
            int ans = Integer.MAX_VALUE;
            for(int i = 0; i < A; i++){
                Arrays.sort(C[i]);
            }

            for(int i = 0; i < A-1; i++){
                for(int j = 0; j < B; j++){
                    int lowerBoundDiff = searchMin(C[i+1], C[i][j]);
                    int upperBoundDiff = searchMax(C[i+1], C[i][j]);

                    if(lowerBoundDiff == -1)
                        ans = min(ans, upperBoundDiff);
                    else if(upperBoundDiff == -1)
                        ans = min(ans, lowerBoundDiff);
                    else
                        ans = min(ans, min(lowerBoundDiff, upperBoundDiff));
                }
            }
            return ans;
        }

        public static int min(int n1, int n2){
            return n1 < n2 ? n1 : n2;
        }

        public static int max(int n1, int n2){
            return n1 > n2 ? n1 : n2;
        }

        public static int searchMin(int[] ar, int ele){
            int lowerBoundDiff = -1;
            int l = 0;
            int h = ar.length - 1;

            while(l <= h){
                int mid = l + ((h - l)/2);
                if(ar[mid] <= ele) {
                    if(mid == ar.length-1 || ar[mid+1] > ele)
                        return (ele - ar[mid]);
                    else
                        l = mid+1;
                }else {
                    h = mid - 1;
                }
            }
            return lowerBoundDiff;
        }

        public static int searchMax(int[] ar, int ele){
            int upperBoundDiff = -1;
            int l = 0;
            int h = ar.length - 1;

            while(l <= h){
                int mid = l + ((h - l)/2);
                if(ar[mid] >= ele) {
                    if(mid == 0 || ar[mid-1] > ele)
                        return (ar[mid] - ele);
                    else
                        h = mid - 1;
                }else {
                    l = mid + 1;
                }
            }
            return upperBoundDiff;
        }
}
