package week1.Day6;

public class countvowelsConsonants {

    public static void main(String[] args) {
        String str="Hello World";
        countvowelconson(str);


    }

    private static void countvowelconson(String str) {
        // TODO Auto-generated method stub

        int vowels=0;
        int consonents=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
                vowels++;

            }
            else{
                consonents++;
            }
        }

        System.out.println("Vowels :"+vowels);
        System.out.println("consonents: "+consonents);
    }
    
}
