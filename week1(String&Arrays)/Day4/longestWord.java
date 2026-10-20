package week1.Day4;

public class longestWord {

    public static void main(String[] args) {
        String str="I love Programming";
        String[] words=str.split(" ");
        String longest="";
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

    }
    
}
