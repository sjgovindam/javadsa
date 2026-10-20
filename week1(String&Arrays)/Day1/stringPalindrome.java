package week1.Day1;

public class stringPalindrome {

    public static void main(String args[]){

        System.out.println(isPalindrome("madam"));

    }

    private static boolean isPalindrome(String s){

        boolean result = true;

        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                result = false;
                break;
            }
        }

        return result;


    }
    
}
