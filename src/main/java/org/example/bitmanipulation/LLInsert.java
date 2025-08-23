package org.example.bitmanipulation;

public class LLInsert {

    public static void main(String args[]){
        ListNode h = new ListNode(6);
        ListNode l = h;

        ListNode n1 = new ListNode(3);
        l.next = n1;
        l = n1;

        ListNode n2 = new ListNode(3);
        l.next = n2;
        l = n2;

        ListNode n3 = new ListNode(6);
        l.next = n3;
        l = n3;

        ListNode n4 = new ListNode(7);
        l.next = n4;
        l = n4;

        ListNode n5 = new ListNode(8);
        l.next = n5;
        l = n5;

        ListNode n6 = new ListNode(7);
        l.next = n6;
        l = n6;

        ListNode n7 = new ListNode(3);
        l.next = n7;
        l = n7;

        ListNode n8 = new ListNode(7);
        l.next = n8;
        l = n8;

        l = h;
        while(l !=null){
            System.out.print(l.val + "->");
            l = l.next;
        }

        System.out.println();
        solve(h, 5, 9);

        l = h;
        while(l !=null){
            System.out.print(l.val + "->");
            l = l.next;
        }
    }

    public static ListNode solve(ListNode A, int B, int C) {
        int size = 0;
        ListNode l = A;
        ListNode newNode = new ListNode(B);

        while(l != null){
            size++;
            l = l.next;
        }

        if(C >= size){
            l = A;
            while(l.next != null){
                l = l.next;
            }
            l.next = newNode;
        }else if(C == 0){
            newNode.next = A;
            A = newNode;
        }else{
            l = A;
            for(int i = 0; i < size; i++){
                if(i == (C - 1)){
                    newNode.next = l.next;
                    l.next = newNode;
                    break;
                }
                l = l.next;
            }
        }

        return A;
    }
}
