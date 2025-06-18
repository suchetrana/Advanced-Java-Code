package Collections;

import java.util.List;

public class UnModifiedList {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
        System.out.println("List is unmodifiable.");
        System.out.println("Contents of List: " + list);
        System.out.println("List is unmodifiable.");
        list.set(0, "x");
        System.out.println("Addition, Removing and Clear is not allowed");
        list.add("x");
        list.remove("x");
        list.clear();
    }
}
