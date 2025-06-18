package Collections.QueueAndDequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Iteration {
    public static void main(String[] args) {
//        Queue Iteration
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
//        M1
        System.out.println("Enhanced for loop");
        for (String element : queue) {
            System.out.println(element);
        }
//        M2
        System.out.println("Iterator");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println("Value of element: "+iterator.next());
        }
//      Dequeue Iteration
        Deque<String> deque = new LinkedList<>();
        deque.offer("1");
        deque.offer("2");
        deque.offer("3");
//        M1
        System.out.println("Enhanced for loop");
        for (String element : deque) {
            System.out.println(element);
        }
//        M2
        System.out.println("Ascending Iterator");
        Iterator<String> ascendingIterator = queue.iterator();
        while (ascendingIterator.hasNext()) {
            System.out.println("Value of element: "+ascendingIterator.next());
        }
//        M3
        System.out.println("Descending Iterator");
        Iterator<String> descendingIterator = deque.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println("Value of element: "+descendingIterator.next());
        }
    }
}
