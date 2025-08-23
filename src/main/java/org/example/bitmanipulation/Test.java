package org.example.bitmanipulation;

import java.util.*;

public class Test {

    public static void main(String args[]) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(reorderList(node));
    }
    public static ListNode reorderList(ListNode A) {

        if(A.next == null || A.next.next == null){
            return A;
        }

        ListNode mid = mid(A);

        ListNode temp1 = A;
        while(temp1 != mid){
            temp1 = temp1.next;
        }

        ListNode temp2 = temp1.next;
        temp1.next = null;

        temp2 = reverseList(temp2);

        ListNode ans = null;
        ListNode a = null;
        while(A!=null && temp2!=null){
            ListNode n = new ListNode(A.val);
            n.next = new ListNode(temp2.val);
            n.next.next = null;
            if(ans == null) {
                ans = n;
                a = ans;
                a = a.next;
            }else {
                a.next = n;
                a = a.next.next;
            }
            A = A.next;
            temp2 = temp2.next;
        }

        while(A != null){
            ListNode n = new ListNode(A.val);
            a.next = n;
            A = A.next;
        }

        while(temp2 != null){
            ListNode n = new ListNode(temp2.val);
            a.next = n;
            temp2 = temp2.next;
        }
        return ans;

    }


    public static ListNode reverseList(ListNode temp2){
        ListNode prev = null;
        ListNode curr = temp2;

        if(curr.next == null)
            return curr;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }

        return prev;
    }

    public static ListNode mid(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next == null)
            return slow;

        return slow;
    }
}
