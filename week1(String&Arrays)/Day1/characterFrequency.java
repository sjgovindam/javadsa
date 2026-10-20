package week1.Day1;

import java.util.HashMap;
import java.util.Map;

public class characterFrequency {

    public static void main(String args[]){
        String s="hello";

        Map<Character,Integer> result=countFrequency(s);
        for(Map.Entry<Character,Integer> entry: result.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    private static Map<Character, Integer> countFrequency(String s) {

        Map<Character,Integer> frequency=new HashMap<>();

        for(char ch: s.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch,0)+1 );
        }


        return frequency;
    }
    
}
