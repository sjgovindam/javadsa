package week1.Day2;

public class findMinimum {

    public static void main(String[] args) {
        int nums[]={2,4,7,3,23,1};
        System.out.println(findmin(nums));
    }

    private static int findmin(int[] nums) {
        // TODO Auto-generated method stub
        int min=nums[0];

        for(int i:nums){

            if(i < min){
                min=i;
            }
            

        }


        return min;
    }
    
}
