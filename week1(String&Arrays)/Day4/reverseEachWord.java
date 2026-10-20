package week1.Day4;

public class reverseEachWord {

    public static void main(String[] args) {
        String s= "I love Programming";
        System.out.println(reverseeachword(s));
    }

    private static String reverseeachword(String s) {
        // TODO Auto-generated method stub

        String[] words= s.split(" ");
        StringBuilder result =new StringBuilder();
        for(String word: words){
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }

        return result.toString().trim();
    }
    
}
