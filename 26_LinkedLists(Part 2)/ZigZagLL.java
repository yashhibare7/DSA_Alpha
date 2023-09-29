/* Zig Zag Linked List
   For a linked list of the form : L(1) -> L(2) -> L(3) -> L(4)...L(n-1) -> L(n)
   Convert it into a zig-zag form i.e. : L(1) -> L(n) -> L(2) -> L(n-1) -> L(3) -> L(n-2)...

   1->2->3->4->5
   1->5->2->4->3
 */



public class ZigZagLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1:- Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2:- newNode next = head
        newNode.next = head; //link

        //step 3:- head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step 1:- Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2:- tail.next = newNode
        tail.next = newNode;

        //step 3:- tail = newNode
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.print("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left=head;
        Node right=prev;
        Node nextL, nextR;

        //alt merge - Zig Zag merge
        while()
    }
    public static void main(String args[]){

    }
}

//T425G71
