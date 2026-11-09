package week2_collections.Day1;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {

    public static void main(String[] args) {
        int[] nums={1,2,3,2,4,3,5,1};
        findup(nums);
    }

    private static void findup(int[] nums) {
        // TODO Auto-generated method stub
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

        for(int num : nums){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates"+""+duplicates);

    }
    
}
