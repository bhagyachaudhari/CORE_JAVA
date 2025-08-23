package org.example.arrayexamples;

public class EvenSubArray {
    public static void main(String args[]){
        int[] A = {978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940};
        //int[] A = {2, 4, 8, 7, 6};
        //int[] A = {2, 4, 8, 6};
        //System.out.println(solve(A));
        System.out.println(solve1(A));
    }

    public static String solve1(int[] A) {

        int N = A.length;
        int evenSubArrays = 0;
        int count = 0;
        if(N % 2 == 0){
            int left_I = 0;
            int left_J = (N/2) - 1;
            int right_I = N/2;
            int right_J = N-1;
            int leftSubArrayLength = left_J - left_I + 1;
            int rightSubArrayLength = right_J - right_I + 1;
            if (leftSubArrayLength % 2 == 0 && rightSubArrayLength % 2 ==0) {
                if(A[left_I] % 2 == 0 && A[left_J] % 2 == 0 && A[right_I] % 2 == 0 && A[right_J] % 2 == 0)
                    return "YES";
            }

        }
        return "NO";
    }
    public static String solve(int[] A) {

        int N = A.length;
        int evenSubArrays = 0;
        int count = 0;
        for(int S = 0; S < N; S++){
            for(int E = S + 1; E < N; E++) {
                if ((E - S + 1) % 2 == 0) {
                    if (A[S] % 2 == 0 && A[E] % 2 == 0) {
                        count++;
                    }
                    evenSubArrays++;
                }
            }

        }

        if(evenSubArrays > 0 && evenSubArrays == count)
            return "YES";
        else
            return "NO";
    }
}
