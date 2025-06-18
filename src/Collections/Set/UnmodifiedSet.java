package Collections.Set;

import java.util.Set;

public class UnmodifiedSet {
    public static void main(String[] args) {
        Set<String> set = Set.of("a", "b", "c", "d", "e");
        System.out.println("this is unmodified set");
        System.out.println("set is :"+set);
        System.out.println("Cannot add, remove and clear Set");
    }
}
