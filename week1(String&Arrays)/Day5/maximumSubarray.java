package week1.Day5;

public class maximumSubarray {

    public static void main(String[] args) {
        int[] nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarray(nums));
    }

    private static int maximumSubarray(int[] nums) {
        // TODO Auto-generated method stub
        int currentsum=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<nums.length;i++){

            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(currentsum, maxsum);

        }
        return maxsum;
    }

}
