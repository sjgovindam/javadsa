//https://www.youtube.com/watch?v=C9V66KyZCP8&t=909s
package week2_collections.Day1;

import java.util.*;

public class groupAnagramFrequency {

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            String key = getFrequencyString(str);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    // Generate frequency key
    private String getFrequencyString(String str) {

        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder key = new StringBuilder();

        char ch = 'a';

        for (int count : freq) {
            key.append(ch);
            key.append(count);
            ch++;
        }

        return key.toString();
    }

    public static void main(String[] args) {

        groupAnagramFrequency solution = new groupAnagramFrequency();

        String[] strs = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        List<List<String>> result = solution.groupAnagrams(strs);

        System.out.println(result);
    }
}
