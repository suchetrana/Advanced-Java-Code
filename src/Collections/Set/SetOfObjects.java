package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetOfObjects {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(10, "Billy"));
        set.add(new Employee(20, "Dua"));
        set.add(new Employee(10, "Weekend"));
        System.out.println("--Default--");
        System.out.println("Contents of set are: " + set);

    }
}
