package week1.Day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findIntersection {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        //System.out.println(Arrays.toString(intersection(arr1, arr2)));

        int [] result=intersection(arr1, arr2);
        for(int num:result){
            System.out.println(num);
        }
    }

    private static int[] intersection(int[] arr1, int[] arr2) {
        // TODO Auto-generated method stub

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        
        for(int num:arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();


    }
    
}
