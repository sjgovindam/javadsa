package week3_streams.Day2;

import java.util.*;

public class SecondHighestSalary {

    public static void main(String[] args) {

        List<Integer> salaries = Arrays.asList(
            50000, 75000, 90000, 65000, 75000
        );

        int secondHighest = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("Second Highest Salary: " + secondHighest);
    }
}
