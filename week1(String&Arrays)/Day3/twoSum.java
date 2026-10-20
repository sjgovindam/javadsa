package week1.Day3;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        int nums[]={22,34,56,74,12,4,15,1};
        int target=18;
        int result[]=findtarget(nums,target);

        System.out.println(result[0]+","+result[1]);

    }

    private static int[] findtarget(int[] nums, int target) {

        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }

            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
    
}
