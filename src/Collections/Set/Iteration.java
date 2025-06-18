package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
//        Enhanced for-loop
        System.out.println("--Enhanced for-loop--");
        for(String element : set) {
            System.out.println("Value of element is :"+element);
        }
//        Using Iterator
        System.out.println("--Using Iterator--");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println("Value of element: "+iterator.next());
        }



    }
}
