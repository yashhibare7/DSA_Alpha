//Deque
//Double ended queue

//addFirst()
//addLast()
//removeFirst()
//removeLast()
//getFirst()
//getLast()

import java.util.*;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First el ="+ deque.getFirst());
        System.out.println("Last el = "+ deque.getLast());
    }
}
