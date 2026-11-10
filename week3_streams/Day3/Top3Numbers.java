package week3_streams.Day3;

import java.util.*;
import java.util.stream.Collectors;

public class Top3Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 50, 20, 80, 40, 80, 60, 50
        );

        List<Integer> top3 = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 Numbers: " + top3);
    }
}