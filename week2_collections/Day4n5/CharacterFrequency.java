//Using Linked Hashmap
package week2_collections.Day4n5;
import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "programming";

        LinkedHashMap<Character, Integer> frequency =
                new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            frequency.put(
                ch,
                frequency.getOrDefault(ch, 0) + 1
            );
        }

        for (Map.Entry<Character, Integer> entry :
                frequency.entrySet()) {

            System.out.println(
                entry.getKey() + " = " + entry.getValue()
            );
        }
    }
}

