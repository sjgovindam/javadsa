package week3_streams.Day1;


import java.util.*;
import java.util.stream.*;

public class SquareNumbersStream {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(squares);
    }
}

