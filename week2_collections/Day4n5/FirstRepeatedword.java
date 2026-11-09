package week2_collections.Day4n5;


import java.util.*;

public class FirstRepeatedWord {

    public static void main(String[] args) {

        String str = "Java Python Spring Java Python";

        String[] words = str.split("\\s+");

        Set<String> seen = new HashSet<>();

        for (String word : words) {

            if (seen.contains(word)) {
                System.out.println("First repeated word: " + word);
                return;
            }

            seen.add(word);
        }

        System.out.println("No repeated word found");
    }
}

