package week3_streams.Day3;

import java.util.*;

public class LongestString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
            "Java", "Python", "SpringBoot", "Microservices", "AWS"
        );

        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("Longest String: " + longest);
    }
}