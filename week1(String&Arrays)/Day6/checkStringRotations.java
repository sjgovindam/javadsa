package week1.Day6;

public class checkStringRotations {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println(isRotation(s1, s2));
    }

    private static boolean isRotation(String s1, String s2) {
        // TODO Auto-generated method stub

        if(s1.length()!=s2.length()){
            return false;
        }

        String combined= s1+s2;
        return combined.contains(s2);
    }
    
}
