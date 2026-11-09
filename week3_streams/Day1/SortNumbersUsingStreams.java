package week3_streams.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersUsingStreams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + sorted);
    }
}