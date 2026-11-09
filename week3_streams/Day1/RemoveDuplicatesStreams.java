package week3_streams.Day1;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesStreams {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);
    }
}