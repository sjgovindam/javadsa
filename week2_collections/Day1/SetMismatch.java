package week2_collections.Day1;


import java.util.*;

public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        int duplicate = -1;
        int missing = -1;

        // Find duplicate
        for (int num : nums) {

            if (!seen.add(num)) {
                duplicate = num;
            }
        }

        // Find missing number
        for (int i = 1; i <= nums.length; i++) {

            if (!seen.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[] {duplicate, missing};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        int[] result = findErrorNums(nums);

        System.out.println(Arrays.toString(result));
    }
}
