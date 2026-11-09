//https://www.youtube.com/watch?v=EBNPu0GgM64
package week2_collections.Day2;


import java.util.*;

public class topkFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        // Step 2: Count frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(
                n,
                frequencyMap.getOrDefault(n, 0) + 1
            );
        }

        // Step 3: Place numbers into frequency buckets
        for (int key : frequencyMap.keySet()) {

            int frequency = frequencyMap.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }

        // Step 4: Collect top k frequent elements
        List<Integer> topK = new ArrayList<>();

        for (int pos = bucket.length - 1;
             pos >= 0 && topK.size() < k;
             pos--) {

            if (bucket[pos] != null) {
                topK.addAll(bucket[pos]);
            }
        }

        // Step 5: Convert List to int[]
        return topK.stream().mapToInt(i -> i).limit(k).toArray();
    }

    public static void main(String[] args) {

        topkFrequentElements solution =
            new topkFrequentElements();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }
}
