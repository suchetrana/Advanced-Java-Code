package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedAndArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int numberOfElements = 100000;
//        For adding Linked List is best
        long startTime1 = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Time taken by ArrayList to Add: " + duration1 + " ns");
        long startTime2 = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Time taken by LinkedList to Add: " + duration2 + " ns");
//        For getting ArrayList is Fast
        long startTime3 = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.get(i);
        }
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;
        System.out.println("Time taken by ArrayList to Get: " + duration3 + " ns");
        long startTime4 = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.get(i);
        }
        long endTime4 = System.nanoTime();
        long duration4 = endTime4 - startTime4;
        System.out.println("Time taken by LinkedList to Get: " + duration4 + " ns");
    }
}
