
package week2_collections.Day2;
import java.util.*;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        // Step 1: Add all numbers to HashSet
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check consecutive sequences
        for (int num : set) {

            // Start counting only if num is the beginning
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        LongestConsecutiveSequence solution =
            new LongestConsecutiveSequence();

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = solution.longestConsecutive(nums);

        System.out.println("Longest consecutive length: " + result);
    }
}

