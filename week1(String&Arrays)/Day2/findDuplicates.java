package week1.Day2;

import java.util.*;

public class findDuplicates{

    public static void main(String args[]){

        int[] num={1,2,2,3,3,4,5,6,7,8,1,1};

        System.out.println(findduplicates(num));


    }

    private static Set<Integer> findduplicates(int num[]){

        Set<Integer> seen= new HashSet<>();
        Set<Integer> duplicates= new HashSet<>();

        for (int i: num){
            if(!seen.add(i)){
                duplicates.add(i);
            }
        }

        return duplicates;
    }

}