package Generics.Wildcard;
// Wild card is used to refer parent or child those data type
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Demo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
        List<Number> list3 = Arrays.asList(70, 40, 3.3);
        List<String> list4 = Arrays.asList("Hello", "JAVA");
        System.out.println("-- Prints Integer --");
        print1(list1);
//        print1(list2);
//        print1(list3);
//        print1(list4);
        System.out.println("Prints Integer and its Parent");
        print2(list1);
//        print2(list2);
        print2(list3);
//        print2(list4);
        System.out.println("Prints Integer and its Child");
        print3(list1);
        print3(list2);
        print3(list3);
        System.out.println("Prints Everything");
        print4(list1);
        print4(list2);
        print4(list3);
        print4(list4);
    }
    private static void print1(List<Integer> list) {
        System.out.println(list);
    }
    private static void print2(List<? super Integer> list) {  // this  use to print parent
        System.out.println(list);
    }
    private static void print3(List<? extends Number> list) {  // this  use to print child
        System.out.println(list);
    }
    private static void print4(List<?> list) {
        System.out.println(list);
    }
}
