package week1.Day4;

import java.util.LinkedHashMap;
import java.util.Map;

public class AnagramusingHashmap {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silont";

        System.out.println(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        // TODO Auto-generated method stub

        if(s1.length()!=s2.length()){
            return false;
        }

        Map<Character,Integer> frequency= new LinkedHashMap<>();

        for(char ch:s1.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        for(char ch :s2.toCharArray()){
            if(!frequency.containsKey(ch)|| frequency.get(ch)==0){
                return false;
            }
                frequency.put(ch,frequency.get(ch)-1);
        }
        return true;

    }
    
}
