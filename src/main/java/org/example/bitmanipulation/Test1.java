package org.example.bitmanipulation;

import java.util.*;

public class Test1 {
    Stack<TreeNode> minStack = new Stack<>();
    Stack<TreeNode> maxStack = new Stack<>();
    public static void main(String args[]){
        TreeNode A = new TreeNode(10);
        A.left = new TreeNode(9);
        A.right = new TreeNode(20);

        /*A.left.left = new TreeNode(6);
        A.left.right = new TreeNode(8);

        A.right.right = new TreeNode(22);*/
        Test1 t = new Test1();
        System.out.println(t.t2Sum(A, 40));
    }

    public int t2Sum(TreeNode A, int B) {
        TreeNode curr = A;
        while(curr != null){
            minStack.push(curr);
            curr = curr.left;
        }

        TreeNode itr1 = minStack.peek();

        curr = A;
        while(curr != null){
            maxStack.push(curr);
            curr = curr.right;
        }

        TreeNode itr2 = maxStack.peek();

        //int x = maxStack.peek().val;
        //int y = minStack.peek().val;

        while((itr1.val + itr2.val != B) && !minStack.empty() && !maxStack.empty()){
            while(itr1.val + itr2.val < B){
                TreeNode deleted = minStack.pop();
                if(deleted.right != null){
                    deleted = deleted.right;
                    minStack.push(deleted);
                    deleted = deleted.left;
                    while(deleted != null){
                        minStack.push(deleted);
                        deleted = deleted.left;
                    }
                }
                itr1 = minStack.peek();
                //x = itr1.val;
                //y = itr1.val;
            }

            while(itr1.val + itr2.val > B){
                TreeNode deleted = maxStack.pop();
                if(deleted.left != null){
                    deleted = deleted.left;
                    maxStack.push(deleted);
                    deleted = deleted.right;
                    while(deleted != null){
                        maxStack.push(deleted);
                        deleted = deleted.right;
                    }
                }
                itr2 = maxStack.peek();
                //x = itr2.val;
                //y = itr2.val;
            }
        }

        if(itr1.val + itr2.val == B && itr1 != itr2)
            return 1;

        return 0;
    }
}
