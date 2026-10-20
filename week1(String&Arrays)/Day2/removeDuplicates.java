package week1.Day2;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        int num[]={1,2,1,2,3,4,5,6,6,7,8,9};

        System.out.println(removeduplicates(num));

    }

    private static Set<Integer> removeduplicates(int num[]){
        Set<Integer> unique=new HashSet<>();

        for(int i : num){
            unique.add(i);
        }


        return unique;

    }
}
