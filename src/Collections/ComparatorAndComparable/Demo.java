package Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(20,"Robson"));
        list.add(new Employee(30,"Michael"));
        list.add(new Employee(10,"James"));
        System.out.println("--Default--");
        System.out.println("Contents of list: " + list);

        System.out.println("--Sort by ID--");
        Collections.sort(list);
        System.out.println("Contents of list: " + list);

        System.out.println("--Sort by Name--");
        Collections.sort(list, new CustomEmployeeComparator());
        System.out.println("Contents of list: " + list);

    }
}
