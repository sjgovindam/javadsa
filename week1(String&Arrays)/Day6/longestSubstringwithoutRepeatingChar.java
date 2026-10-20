package week1.Day6;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringwithoutRepeatingChar {

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lswrc(s));
    }

    private static int lswrc(String s) {
        // TODO Auto-generated method stub

        Set<Character> charset=new HashSet<>();
        int maxlength=0;
        int left=0;

        for(int right=0;right<s.length();right++){
            while (charset.contains(s.charAt(right))) {

                charset.remove(s.charAt(left));
                left++;
                
            }

            charset.add(s.charAt(right));
            maxlength=Math.max(maxlength, right-left+1);

        }

        return maxlength;

    }
    
}
