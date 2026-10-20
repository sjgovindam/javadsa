//https://www.youtube.com/watch?v=wtOQaovlvhY
package week1.Day6;

import java.util.Arrays;

public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};

        System.out.println(lcp(str));
    }

    private static String lcp(String[] str) {
        // TODO Auto-generated method stub

        if(str ==null || str.length==0){
            return "";
        }

        StringBuilder result = new StringBuilder();
        Arrays.sort(str);

        char[] first=str[0].toCharArray();
        char[] last=str[str.length-1].toCharArray();

        for(int i=0;i<str.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
            
        }
        return result.toString();


    }
    
}
