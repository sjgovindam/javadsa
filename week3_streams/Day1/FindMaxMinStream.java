package week3_streams.Day1;


import java.util.*;
import java.util.stream.*;

public class FindMaxMinStream {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 5, 25, 3, 18, 40, 2);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
