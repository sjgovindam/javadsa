package week1.Day1;

public class largestElement {

    public static void main(String args[]){
        
        int num[] = {1,2,3,4,10,6,7,8,9};
        System.out.println(largest(num));
    }
    
    private static int largest(int num[]){

        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
}
