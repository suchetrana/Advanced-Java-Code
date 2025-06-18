package Collections.List;

import java.util.Arrays;
import java.util.List;

public class CreatingListFromArray {
    public static void main(String[] args) {
        String[] array = {"Java", "C++", "C#", "Python"};
        System.out.println(Arrays.toString(array));
        System.out.println("The list is backed by array.");
        List<String> list = Arrays.asList(array);
        list.set(1, "GoLang");
        System.out.println(list);
        System.out.println(Arrays.toString(array));
        System.out.println("Cannot add element to the list.");
//        list.add("Ruby");
        System.out.println("Cannot remove element to the list.");
//        list.remove("Java");
        System.out.println("Clear is not allowed.");
//        list.clear();
    }
}
