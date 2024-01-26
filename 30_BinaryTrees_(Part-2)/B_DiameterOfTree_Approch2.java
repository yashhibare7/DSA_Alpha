import java.util.*;
public class B_DiameterOfTree_Approch2 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info righInfo = diameter(root.right);

        int diam = Math.max( Math.max(leftInfo.diam,righInfo.diam),leftInfo.ht + righInfo.ht + 1);
        int ht = Math.max(leftInfo.ht,righInfo.ht) + 1;

        return new Info(diam, ht);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter Of the Binary Tree :"+diameter(root).diam);
        System.out.println("Height Of the Binary Tree :"+diameter(root).ht);
    }
}
