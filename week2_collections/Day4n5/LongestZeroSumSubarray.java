
//prefix sum
package week2_collections.Day4n5;


import java.util.*;

public class LongestZeroSumSubarray {

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If prefix sum is zero
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If prefix sum already exists
            if (map.containsKey(sum)) {

                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);

            } else {
                map.put(sum, i);
            }
        }

        System.out.println("Longest zero-sum subarray length: "
                           + maxLength);
    }
}
