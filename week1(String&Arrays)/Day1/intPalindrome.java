package week1.Day1;

public class intPalindrome {

    public static void main(String args[]){
        System.out.println(isPalindrome(12324));
    }
    private static boolean isPalindrome(int n){

        int origina =n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n/=10;

        }
        return origina==reverse;
    }
}
