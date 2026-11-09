package week2_collections.Day1;


import java.util.*;

public class UniqueCharacters {

    public static void findUnique(String str) {

        Map<Character, Integer> frequency = new HashMap<>();

        // Count character frequency
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Find characters appearing only once
        for (char ch : str.toCharArray()) {

            if (frequency.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {

        String str = "programming";

        findUnique(str);
    }
}
