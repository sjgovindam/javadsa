package week1.Day5;

public class minSubarray {

    public static void main(String[] args) {
        int[] nums = {3, -4, 2, -3, -1, 7, -5};
        System.out.println(min_subarray(nums));
    }

    private static int min_subarray(int[] nums) {
        // TODO Auto-generated method stub

        int currentsum=nums[0];
        int minsum=nums[0];

        for(int i=0;i<nums.length;i++){
            currentsum=Math.min(nums[i],currentsum+nums[i]);
            minsum=Math.min(currentsum,minsum);

        }

        return minsum;

    }
    
}
