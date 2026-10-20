package week1.Day4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacters  {

    public static void main(String[] args) {
        String s="programming";
        findnonRepeatingChar(s);
    }

    private static void findnonRepeatingChar(String s) {
        // TODO Auto-generated method stub

        Map<Character,Integer> frequency=new LinkedHashMap<>();
        //Here if we use simple hasmap it will give non repeating char not with order
        for (char ch: s.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:frequency.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }

    }
    
}
