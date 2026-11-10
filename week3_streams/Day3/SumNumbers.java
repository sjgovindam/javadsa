package week3_streams.Day3;

import java.util.*;

public class SumNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 20, 30, 40, 50
        );

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
