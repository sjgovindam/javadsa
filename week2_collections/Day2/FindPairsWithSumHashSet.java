//two sum with Arraylist
package week2_collections.Day2;
import java.util.*;

public class FindPairsWithSumHashSet {

    public static List<List<Integer>> findPairs(int[] nums, int target) {

        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {

            int complement = target - num;

            if (seen.contains(complement)) {
                result.add(Arrays.asList(complement, num));
            }

            seen.add(num);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15, 3, 6};
        int target = 9;

        System.out.println(findPairs(nums, target));
    }
}