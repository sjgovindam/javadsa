package week2_collections.Day1;
 
import java.util.*;

public class FirstUniqueCharacter {

    public static char firstUnique(String str) {

        Map<Character, Integer> frequency = new HashMap<>();

        // Step 1: Count character frequency
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first non-repeating character
        for (char ch : str.toCharArray()) {

            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String str = "swiss";

        char result = firstUnique(str);

        if (result != '\0') {
            System.out.println("First unique character: " + result);
        } else {
            System.out.println("No unique character found");
        }
    }
}
