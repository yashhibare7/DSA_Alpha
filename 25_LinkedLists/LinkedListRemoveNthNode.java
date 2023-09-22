public class LinkedListRemoveNthNode {
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
    
        public void addFirst(int data){
            //step 1:- Create new node
            Node newNode = new Node(data);
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
    
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
    
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        public void deleteNthfromEnd(int n){
            int sz = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                sz++;
            }

            if(n == sz){
                head = head.next;
            }

            int i = 1;
            int iToFind = sz-n;
            Node prev = head;
            while(i<iToFind){
                prev = prev.next;
                i++;
            }

            prev.next=prev.next.next;
            return;
        }
    
        public static void main(String args[]){
            LinkedListRemoveNthNode ll = new LinkedListRemoveNthNode();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            
            ll.print();
            ll.deleteNthfromEnd(2);
            ll.print();
            
        }
    }
    

