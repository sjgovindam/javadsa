//Prefix sum
//https://www.youtube.com/watch?v=YxRmeRyVQm4
package week2_collections.Day2;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumHashMap {

    public static int countSubarrays(int[] nums, int k) {

        Map<Integer, Integer> prefixMap = new HashMap<>();

        // Empty prefix has sum 0, occurring once
        prefixMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            int requiredSum = prefixSum - k;

            if (prefixMap.containsKey(requiredSum)) {
                count += prefixMap.get(requiredSum);
            }

            prefixMap.put(
                prefixSum,
                prefixMap.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(countSubarrays(nums, k));
    }
}