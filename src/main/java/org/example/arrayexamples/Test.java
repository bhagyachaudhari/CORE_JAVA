package org.example.arrayexamples;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test {

    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(57);
        A.add(3);
        A.add(-87);
        A.add(42);
        A.add(38);
        A.add(31);
        A.add(-7);
        A.add(-28);
        A.add(-14);
        A.add(-61);
        System.out.println(solve(A, 10));
    }

    public static int solve(ArrayList<Integer> A, int B) {

        int total = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(Integer ele : A){
            minHeap.add(ele);
        }

        while(B > 0){

            if(minHeap.size() > 0)
                total = total + (-(minHeap.poll()));

            B--;
        }

        return total;
    }
}
