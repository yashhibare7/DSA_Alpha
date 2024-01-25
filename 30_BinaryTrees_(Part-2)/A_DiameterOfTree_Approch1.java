import java.util.*;

public class A_DiameterOfTree_Approch1 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);

        return lheight+rheight+1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int lDiameter = diameter(root.left);
        int leftHeight = height(root.left);
        int rDiameter = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter,Math.max(lDiameter, rDiameter));
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(diameter(root));
    }
}
