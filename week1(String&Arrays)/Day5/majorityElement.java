package week1.Day5;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(findmajority(nums));
    }

    private static int findmajority(int[] nums) {
        // TODO Auto-generated method stub
        int candidate=0;
        int count=0;

        for(int num:nums){

            if(count==0){
                candidate=num;
            }

            if(num==candidate){
                count++;
            }
            else{
                count--;
            }

        }



        return candidate;
    }
    
}
