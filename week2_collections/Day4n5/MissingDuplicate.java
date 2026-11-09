//LeetCode 645 – Set Mismatch.
package week2_collections.Day4n5;
import java.util.*;

public class MissingDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5};
        int n = arr.length;

        Set<Integer> seen = new HashSet<>();

        int duplicate = -1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {

            actualSum += num;

            if (!seen.add(num)) {
                duplicate = num;
            }
        }

        int missing = expectedSum - (actualSum - duplicate);

        System.out.println("Duplicate: " + duplicate);
        System.out.println("Missing: " + missing);
    }
}
