package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetOfObjects {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(10, "Billy"));
        set.add(new Employee(20, "Dua"));
        set.add(new Employee(30, "Weekend"));
        System.out.println("--Default--");
        System.out.println("Contents of set are: " + set);
        System.out.println("Sort acc to Name: ");
        Set<Employee> set2 = new TreeSet<>(new CustomEmployeeComparator());
        set2.addAll(set);
        System.out.println("Contents of set are: " + set2);

    }
}
