package week1.Day2;

public class reverseInteger {

    public static void main(String[] args) {
        int num=123456;
        System.out.println(reverseno(num));
        
    }

    private static int reverseno(int num) {
        // TODO Auto-generated method stub
        int reverse=0;

        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }


        return reverse;
    }
    
}
