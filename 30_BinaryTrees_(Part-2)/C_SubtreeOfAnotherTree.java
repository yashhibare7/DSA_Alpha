//Subtree of another Tree

/*
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure
and node values of subRoot and false otherwise.

            tree                        subTree
             1                             2
          /     \                        /   \
        2        3                      4     5
      /  \        \
     4    5        6
*/

public class C_SubtreeOfAnotherTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node,Node subRoot){
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if (root == null){
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root,subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String args[]){
        /*
         tree                       
             1                           
          /     \                        
        2        3                      
      /  \        \
     4    5        6
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.right = new Node(6);

         /*
           subTree
               2
             /   \
            4     5                                  
          */

          Node subRoot = new Node(2);
          subRoot.left = new Node(4);
          subRoot.right = new Node(5);

          System.out.println(isSubtree(root, subRoot));
    }
}
