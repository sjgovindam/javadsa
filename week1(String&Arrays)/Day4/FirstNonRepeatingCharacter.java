package week1.Day4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="nonprogrammingp";
        char result=findFirstNonRepeating(s);
        if(result!='\0'){
        System.out.println(result);
        } else{
            System.out.println("No non Repeating Character");
        }

    }

    private static char findFirstNonRepeating(String s) {
        // TODO Auto-generated method stub
        Map<Character,Integer> frequency=new LinkedHashMap<>();
        //Can also use Hashmap as it does not require order to be preserved
        for(char ch:s.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0) +1);
        }
        for(char ch:s.toCharArray()){
            if(frequency.get(ch)==1){
                return ch;
            }
        }
        return '\0';

    }    
}
