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
 */

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
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
    }
}
