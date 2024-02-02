/*
 Delete A Node

                      8
                    /   \
                  5      10
                /  \       \
               3    6       11
             /  \             \
            1    4             14


            Cases
            1. No child (leaf Node)
            2. One child
            3. Two children

               
            Case 1: No Child (Leaf Node)
                      8
                    /   \                               Delete Node & Return NUll to parent
                  5      10                        
                /  \       \                            Eg: 1, 4, 6, 14 After delete the node java garbage collector
               3    6 <--    11                              remove the value
             /  \             \
        --> 1    4 <--          14 <--              


            Case 2: one Child
                      8
                    /   \                               Delete Node & replace with child node
                  5      10 <--                       
                /  \       \                            Eg: 10, 11 After delete the node java garbage collector
               3    6       11 <--                             remove the value
             /  \             \
            1    4             14 
            
            
            Case 3: Two children
                 -->  8
                    /   \                               Replace value with inorder successor
              --> 5      10                             Delete the node for inorder successor
                /  \       \                            
           --> 3    6       11                          *inorder successor always has 0 or 1 child
             /  \             \
            1    4             14 
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class D_DeleteANode {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val){
      if (root.data < val) {
        root.right = delete(root.right, val);
      } else if (root.data > val) {
        root.left = delete(root.left, val);
      } else{//voila
        //case 1 - leaf Node
        if (root.left == null && root.right == null) {
          return null;
        }

        //case 2 - single child
        if (root.left == null) {
          return root.right;
        } else if (root.right == null) {
          return root.left;
        }

        //case 3 - both children
        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right, IS.data);
      }

      return root;
    }

    public static Node findInorderSuccessor(Node root){
      while (root.left != null) {
        root = root.left;
      }
      return root;
    }


    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
          root = insert(root, values[i]);
      }

      inorder(root);
      System.out.println();

      root = delete(root, 1);
      System.out.println();

      inorder(root);
    }
}
