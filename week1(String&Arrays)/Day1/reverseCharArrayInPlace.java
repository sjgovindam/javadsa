package week1.Day1;

public class reverseCharArrayInPlace {

    public static void main(String[] args) {
    char s[]= {'h', 'e', 'l', 'l', 'o'};
   reverse(s);
    System.out.println(s);

    }

    private static void reverse(char[]s){

        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }

    }
}
