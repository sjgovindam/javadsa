package week1.Day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharacters {

    public static void main(String[] args) {
        String str="Programming";
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(seen.add(ch)){
                result.append(ch);
            }
        }

        System.out.println(result);

        
    }
    
}
