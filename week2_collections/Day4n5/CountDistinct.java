package week2_collections.Day4n5;

import java.util.*;

public class CountDistinct {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Distinct elements: " + set);
        System.out.println("Count: " + set.size());
    }
}
