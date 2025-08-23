package org.example.bitmanipulation;

public class LLReverse {

    public static void main(String args[]){
        ListNode h = new ListNode(17);
        ListNode l = h;

        ListNode n1 = new ListNode(4);
        l.next = n1;
        l = n1;

        ListNode n2 = new ListNode(12);
        l.next = n2;
        l = n2;

        ListNode n3 = new ListNode(10);
        l.next = n3;
        l = n3;

        ListNode n4 = new ListNode(5);
        l.next = n4;

        l = h;
        while(l !=null){
            System.out.print(l.val + "->");
            l = l.next;
        }

        System.out.println();
        solve(h);

       /* l = h;
        while(l !=null){
            System.out.print(l.val + "->");
            l = l.next;
        }*/
    }

    public static void solve(ListNode A) {

        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        A = prev;


        ListNode l = A;
        while(l != null){
            System.out.print(l.val + " ");
            l = l.next;
        }
        System.out.println();
    }
}
