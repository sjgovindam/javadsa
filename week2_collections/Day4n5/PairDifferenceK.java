package week2_collections.Day4n5;

import java.util.*;

public class PairDifferenceK {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        Set<String> result = new LinkedHashSet<>();

        for (int num : arr) {

            if (set.contains(num + k)) {
                result.add(num + "," + (num + k));
            }

            if (set.contains(num - k)) {
                result.add((num - k) + "," + num);
            }
        }

        for (String pair : result) {
            System.out.println(pair);
        }
    }
}
