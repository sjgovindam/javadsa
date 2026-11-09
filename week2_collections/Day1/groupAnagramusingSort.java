package week2_collections.Day1;

import java.util.*;

public class groupAnagramusingSort {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string into character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Create sorted string as key
            String key = new String(chars);

            // Group original strings with same sorted key
            // map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}
