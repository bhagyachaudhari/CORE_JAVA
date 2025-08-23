package org.example.arrayexamples;

public class Bulbs {
    public static void main(String args[]){
        int[] A = {978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940};
        //int[] A = {2, 4, 8, 7, 6};
        //int[] A = {2, 4, 8, 6};
        System.out.println(bulbs(A));
    }
    public static long bulbs(int[] A) {
        long numberOfSwitches = 0;
        for(int s = 0; s < A.length; s++){
            if(A[s] == 0){
                A[s] = 1;
                numberOfSwitches++;
                for(int e = s + 1; e < A.length; e++){
                    A[e] = A[e] == 0 ? 1 : 0;
                }
            }
        }
        return numberOfSwitches;
    }


}
