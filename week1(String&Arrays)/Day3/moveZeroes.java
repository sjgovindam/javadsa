package week1.Day3;

public class moveZeroes {

    public static void main(String[] args) {
        int nums[]={1,0,20,30,0,45,3427,89,0};
        int result[]=movezeroes(nums);
        for(int num:result){
        System.out.println(num);
        }

    }

    private static int[] movezeroes(int[] nums) {
        // TODO Auto-generated method stub

        //int result[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[index]=nums[i];
            index++;

            }
        }

        while(index<nums.length){
            nums[index]=0;
            index++;
        }

        return nums;
    }



}
