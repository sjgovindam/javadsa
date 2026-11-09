package week2_collections.Day4n5;


import java.util.*;

public class CommonCharacters {

    public static void main(String[] args) {

        String str1 = "programming";
        String str2 = "gaming";

        Set<Character> set = new HashSet<>();

        for (char ch : str2.toCharArray()) {
            set.add(ch);
        }

        Set<Character> common = new LinkedHashSet<>();

        for (char ch : str1.toCharArray()) {
            if (set.contains(ch)) {
                common.add(ch);
            }
        }

        System.out.println(common);
    }
}

