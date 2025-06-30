package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        System.out.println("Creating Map");
        Map<Integer, String> map = new HashMap<>();
        System.out.println("Map Size: " + map.size());
        System.out.println("Display Contents: "+map);

        System.out.println("Adding Element");
        map.put(10, "JAVA");
        map.put(20, "PHP");
        map.put(30, "C#");
        System.out.println("Map Size: " + map.size());
        System.out.println("Display Contents: "+map);
        System.out.println("Modify value by key from map");
        map.put(2, "SQL");
        System.out.println("Size of map is: " + map.size());
        System.out.println("Contents of map are: " + map);

        System.out.println("Remove value by key from map");
        map.remove(2);
        System.out.println("Size of map is: " + map.size());
        System.out.println("Contents of map are: " + map);

        System.out.println("Check if map contains key");
        Integer searchableKey = 10;
        if (map.containsKey(searchableKey)) {
            System.out.println("Map contains key: " + searchableKey);
        }

        System.out.println("Check if map contains value");
        String searchableValue = "Java";
        if (map.containsValue(searchableValue)) {
            System.out.println("Map contains value: " + searchableValue);
        }

        System.out.println("Clear map");
        map.clear();
        System.out.println("Size of map is: " + map.size());
        System.out.println("Contents of map are: " + map);

        System.out.println("Check if map is empty");
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        }
    }
}
