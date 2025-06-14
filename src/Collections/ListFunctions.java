package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListFunctions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("Python");
        System.out.println("iterating using idex");
        for(int i=0; i<list.size(); i++){
            System.out.println("Value of element: " + list.get(i));
        }
        System.out.println("Using for each loop");
        for (String s : list) {
            System.out.println("Value of element: " + s);
        }
        System.out.println("Using iterator");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Value of element: " + it.next());
        }

        System.out.println("List iterator -- forward"); // Advantage of listIterator is that you can move forward and backward direction also
//       other all iterator moves in forward direction
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()){
            System.out.println("Value of element: " + li.next());
        }
        System.out.println("List iterator -- backward");
        while(li.hasPrevious()){
            System.out.println("Value of element: " + li.previous());
        }
    }
}
