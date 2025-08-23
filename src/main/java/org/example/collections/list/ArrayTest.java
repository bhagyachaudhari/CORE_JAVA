package org.example.collections.list;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		ArrayList<Integer> innerA1 = new ArrayList<>();
		innerA1.add(1);
		innerA1.add(2);
		innerA1.add(3);
		innerA1.add(4);
		A.add(innerA1);
		
		ArrayList<Integer> innerA2 = new ArrayList<>();
		innerA2.add(5);
		innerA2.add(6);
		innerA2.add(7);
		innerA2.add(8);
		A.add(innerA2);
		
		ArrayList<Integer> innerA3 = new ArrayList<>();
		innerA3.add(9);
		innerA3.add(10);
		innerA3.add(11);
		innerA3.add(12);
		A.add(innerA3);
		
		System.out.println("A: "+A);
		
		ArrayTest at = new ArrayTest();
		ArrayList<ArrayList<Integer>> B = at.performOps(A);
		System.out.println("B: "+B);
		
		for (int i = 0; i < B.size(); i++) {
		    for (int j = 0; j < B.get(i).size(); j++) {
		            System.out.print(B.get(i).get(j) + " ");
		    }
		}
	}

	ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        System.out.println("in fun B: "+B);
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
	}
	
}
