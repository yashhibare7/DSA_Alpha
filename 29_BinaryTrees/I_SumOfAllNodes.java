//Sum Of All Nodes

/*
           1
        /   \
       2     3
     /  \     \
    4   5      6
*/

import java.util.*;
public class I_SumOfAllNodes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int lsum = sum(root.left);
        int rsum = sum(root.right);

        return lsum+rsum+root.data;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(sum(root));
    }
}
