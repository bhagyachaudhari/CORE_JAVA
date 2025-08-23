package org.example.arrayexamples;

public class SmallSubArrayLength {
    public static void main(String args[]){
        int[] A = {814, 761, 697, 483, 981};
        System.out.println(solve(A));
    }
        public static int solve(int[] A) {
            int lastMinIndex = -1;
            int lastMaxIndex = -1;
            int ans = A.length;

            int max = getMax(A);
            int min = getMin(A);

            for(int i = 0; i <= A.length - 1; i++){
                if(A[i] == max){
                    lastMaxIndex = i;
                    if(lastMinIndex != -1)
                        ans = min(ans, (lastMaxIndex - lastMinIndex) + 1);

                }

                if(A[i] == min){
                    lastMinIndex = i;
                    if(lastMaxIndex != -1)
                        ans = min(ans, (lastMinIndex - lastMaxIndex) + 1);
                }
            }
            return ans;
        }

        private static int getMax(int[] A){
            int max = A[0];
            for(int j = 1; j <= A.length-1; j++){
                if(A[j] > max)
                    max = A[j];
            }
            return max;
        }

        private static int getMin(int[] A){
            int min = A[0];
            for(int j = 1; j <= A.length-1; j++){
                if(A[j] < min)
                    min = A[j];
            }
            return min;
        }

        private static int min(int a, int b){
            int min = a > b ? b : a;
            return min;
        }

}
