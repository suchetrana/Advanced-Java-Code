package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating an array!!!");
        String[] array = new String[10];
        System.out.println("Size of array: " + array.length);
        array[0] = "JAVA";
        array[1] = "PHP";
        array[3] = "C#";
        System.out.println(Arrays.toString(array));
        System.out.println("Remove element from the array");
        array[1] = null;

    }
}
