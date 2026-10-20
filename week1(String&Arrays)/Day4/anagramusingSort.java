package week1.Day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagramusingSort {

    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        // TODO Auto-generated method stub

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1,arr2);
    }
    
}
