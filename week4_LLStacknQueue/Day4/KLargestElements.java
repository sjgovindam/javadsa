package week4_LLStacknQueue.Day4;

import java.util.*;

public class KLargestElements {

    public static int[] findKLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        int i = k - 1;

        while (!minHeap.isEmpty()) {
            result[i--] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(
            Arrays.toString(findKLargest(nums, k))
        );
    }
}
