//Count Of Nodes Of a Tree

/*
           1
        /   \
       2     3
     /  \   / \
    4   5  6   7
*/

public class H_CountOfNodesOfTree {
    static class Node {
        int data;
        Node left , right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lcount = count(root.left);
        int rcount = count(root.right);
        
        int treeCount = lcount + rcount+1;

        return treeCount;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(count(root));
    }
}
