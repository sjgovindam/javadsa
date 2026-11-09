package week2_collections.Day1;

import java.util.HashMap;
import java.util.Map;

public class characterFrequency {

    public static void main(String[] args) {

        String str="hello";
        countfrequncy(str);


        
    }

    private static void countfrequncy(String str) {
        // TODO Auto-generated method stub
        HashMap<Character,Integer> frequency=new HashMap<>();

        for(char ch : str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:frequency.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
    
}
