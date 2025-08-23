package org.example.bitmanipulation;

public class LongestConsecutiveOnes {

    public static void main(String args[]){
        System.out.println(solve("11110000100111000101110010111101"));
    }

    public static int solve(String A) {

        char[] arr = A.toCharArray();
        int N = arr.length;
        int totalOneCount = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] == '1')
                totalOneCount++;
        }

        if(totalOneCount == N)
            return totalOneCount;


        int count = 0, ans = 0;
        for(int i = 0; i < N; i++){
            int l = 0;
            int r = 0;
            if(arr[i] == '0'){
                for(int j = i-1; j >= 0; j--){
                    if(arr[j] == '0')
                        break;

                    l++;
                }

                for(int k = i+1; k < N; k++){
                    if(arr[k] == '0')
                        break;

                    r++;
                }

                if(totalOneCount == (l + r))
                    count = l + r;
                else if (totalOneCount > (l + r))
                    count = l + r + 1;

                if(ans < count)
                    ans = count;
            }
        }

        return ans;
    }
}
