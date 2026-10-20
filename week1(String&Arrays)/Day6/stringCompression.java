package week1.Day6;

public class stringCompression {

    public static void main(String[] args) {
        String str="aaabbc";
        System.out.println(compress(str));
    }

    private static String compress(String str) {
        // TODO Auto-generated method stub

        if(str.isEmpty()){
            return "";
        }

        StringBuilder result=new StringBuilder();
        int count=1;

        for(int i=0;i<str.length();i++){
            if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
                count++;
            }

            else{
                result.append(str.charAt(i));
                result.append(count);
                count=1;
            }
        }


        return result.toString();
    }
    
}
