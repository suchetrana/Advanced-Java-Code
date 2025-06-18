package Collections.QueueAndDequeue;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        System.out.println("Create a Queue");
        Queue<String> queue = new LinkedList<>();
        System.out.println("Finding size!!!");
        System.out.println(queue.size());
        System.out.println("Display Contents!!!"+queue);

        System.out.println("Adding Element to Queue always added at tail");
        queue.add("JAVA");
        queue.add("C++");
        queue.add("Python");
        queue.add("C#");

        System.out.println("Size: "+queue.size());
        System.out.println("Display Contents: "+queue);
        System.out.println("Adding Element to Queue Using Offer");
        queue.offer("Advanced JAVA");
        queue.offer("Advanced C++");

//        difference between offer and add method in java
//        when we use add fn it throws exception and return boolean
//        but offer method does not throw exception and return boolean
        System.out.println("Fetch element from head (Starting)");
        System.out.println("Element head: "+queue.peek()); // if element not exist not return error
        System.out.println("Element head: "+queue.element()); // if element not exist return error

        System.out.println("Element head: "+queue.remove()); // return exception error if not exist
        System.out.println("Element head: "+queue.poll());   // not return error if not exist

        System.out.println("Checking queue contains element");
        String searchableItem = "JAVA";
        System.out.println(queue.contains(searchableItem));

        System.out.println("Clearing queue");
        queue.clear();

        System.out.println("Checking queue is empty");
        System.out.println(queue.isEmpty());

//        Adding Multiple Items
        List<String> list = Arrays.asList("SQL", "NUMPY", "NoSQL");
        queue.addAll(list);

//        Sorting Queue 1st you should to convert to list
        List<String> list1 = new ArrayList<>(queue);
        Collections.sort(list1);


    }
}
