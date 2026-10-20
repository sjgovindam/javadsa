package week1.Day4;

public class reverseWord {

    public static void main(String[] args) {
        String s="I love Programming";

        System.out.println(reverseWord(s));
    }

    private static String reverseWord(String s) {
        // TODO Auto-generated method stub

        String[] words=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i>0){
                result.append(" ");
            }
        }

        return result.toString();
    }
    
}
