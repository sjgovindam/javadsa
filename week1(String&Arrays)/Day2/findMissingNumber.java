package week1.Day2;

public class findMissingNumber {

    public static void main(String[] args) {
        int nums[]={1,2,3,5,6};
        int n=6;

        System.out.println(findmissingno(nums, n));

    }

    private static int findmissingno(int[] nums, int n) {
        // TODO Auto-generated method stub

        int expectedsum=n*(n+1)/2;
        int originalsum=0;

        for(int i:nums){
            originalsum+=i;
        }
        int missingno=expectedsum-originalsum;

        return missingno;
    }
    
}
