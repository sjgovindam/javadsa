package week3_streams.Day3;

import java.util.*;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 20, 40, 30, 40, 50, 20
        );

        int secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("Second Highest: " + secondHighest);
    }
}