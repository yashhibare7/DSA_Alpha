/*
 Sorted Array To Balanced BST

 arr = {3,6,5,8,10,11,12}


                      8
                    /  \
                  5     11
                /  \   /  \
               3    6 10   12        
 */
public class A_SortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left,right;

          public Node(int data){
            this.data =data;
          }
    }

    public static Node preorder(Node root){
        if (root == null) return null;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

        return root;
    }
    public static Node createBST(int arr[],int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }
    public static void main(String args[]){
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        Node root = createBST(arr, 0, arr.length-1);

        preorder(root);
    }
}
