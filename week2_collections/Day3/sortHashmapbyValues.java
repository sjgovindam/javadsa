package week2_collections.Day3;
import java.util.*;
import java.util.stream.*;

public class sortHashmapbyValues {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 40);
        map.put("Mango", 10);

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        System.out.println(sortedMap);

            Map<String, Integer> sortedMapdesc = map.entrySet()
        .stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));

                System.out.println(sortedMapdesc);


    }



}