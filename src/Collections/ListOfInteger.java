package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(1); // by default remove acc to index
        System.out.println(list);
        list.remove(Integer.valueOf(1)); // if you want to remove value
        System.out.println(list);
    }
}
