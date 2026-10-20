package week1.Day3;

public class rotateArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void rotate(int[] nums, int k) {
        //k=2%7=2
        k = k % nums.length;

        // Reverse entire array
        //7,6,5,4,3,2,1
        reverse(nums, 0, nums.length - 1);


        // Reverse first k elements
        //6,7,5,4,3,2,1
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        //6,7,1,2,3,4,5
        reverse(nums, k, nums.length - 1);
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
