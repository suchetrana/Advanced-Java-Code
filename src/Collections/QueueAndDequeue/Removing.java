package Collections.QueueAndDequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Removing {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Display Queue: "+queue);
        // removing element on basis object
        queue.remove(2); //treated as object
        System.out.println("Display Queue: "+queue);

        queue.remove(Integer.valueOf(1)); //treated as object
        System.out.println("Display Queue: "+queue);
    }
}
