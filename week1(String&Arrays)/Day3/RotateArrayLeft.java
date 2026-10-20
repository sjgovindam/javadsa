package week1.Day3;

public class RotateArrayLeft {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotateLeft(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void rotateLeft(int[] nums, int k) {

        k = k % nums.length;

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);

        // Reverse entire array
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}