//TreeMap is a Map implementation that automatically sorts entries based on their keys, not values.
package week2_collections.Day4n5;
import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println(map);
        System.out.println("Reverseorder");

                TreeMap<Integer, String> map1 =
                new TreeMap<>(Comparator.reverseOrder());

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println(map1);

    }
}
