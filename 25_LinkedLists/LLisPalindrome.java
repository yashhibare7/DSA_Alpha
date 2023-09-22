public class LLisPalindrome{
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

        public boolean isPalindrome(Node head) {
            Node slow = head; 
            Node fast = head; 
            
            while(fast!=null && fast.next!=null)
            {
                slow = slow.next; 
                fast = fast.next.next;
            }
            
            Node tempHead = null;
            
            if(fast == null){
              tempHead =  reverseLinkedList(slow);
            }
            else{
                tempHead = reverseLinkedList(slow.next);
            }
        
            while(tempHead!=null)
            {
                if(tempHead.data != head.data) return false; 
                tempHead = tempHead.next;
                head = head.next;
            }
            
            return true;
        }
        
        public Node reverseLinkedList(Node head) {
            Node current = head;
            Node pre = null; 
    
            while(current!=null)
            {
                Node post = current.next; 
                current.next = pre; 
                pre = current; 
                current = post;
            }
    
            return pre;
        }
    
        public static void main(String args[]){
            LLisPalindrome ll = new LLisPalindrome();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(2);
            ll.addLast(1);
            
            ll.print();
            System.out.println(ll.isPalindrome(head));
            
        }
    }
    
