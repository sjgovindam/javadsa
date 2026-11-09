package week2_collections.Day3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergemap {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 10);
        map1.put("Banana", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Orange", 30);
        map2.put("Mango", 40);

        Map<String, Integer> result = new HashMap<>(map1);

        result.putAll(map2);

        System.out.println(result);


        //using java streams

        Map<String, Integer> mergedMap = Stream.concat(
        map1.entrySet().stream(),
        map2.entrySet().stream()
).collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (oldValue, newValue) -> newValue
));
         System.out.println(mergedMap);



    }
}