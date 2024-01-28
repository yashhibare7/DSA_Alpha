//Lowest Common Ancestor

/*
                   1
                /    \
              2       3
            /  \       \
          4     5       6

          n1 = 4  n2 = 6          n1 = 4  n2 = 5
         Anc = 1                       Anc = 2
          
*/

import java.util.*;

public class B_LowestCommonAncestor {
    static class  Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root,int n, ArrayList<Node> path){
        if (root==null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if (foundleft || foundright) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common 
        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        //Last equal Node
        Node lca = path1.get(i-1);
        return lca;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1=4;   int n2=5;
        System.out.println(lca(root, n1, n2).data);
    }
}
