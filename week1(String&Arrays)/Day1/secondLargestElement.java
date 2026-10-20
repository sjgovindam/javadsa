package week1.Day1;


public class secondLargestElement {

    public static void main(String arg[]){

        int num[]={11,2,22,30,14,7,4};

        System.out.println(secondLargestelement(num));
    }
    private static int secondLargestelement(int num[]){
            int largest=Integer.MIN_VALUE;
            int secondlargest=Integer.MIN_VALUE;

            for(int i : num){
                if(i >largest){
                    secondlargest=largest;
                    largest=i;

                }
                else if(i > secondlargest && i != largest){
                    secondlargest=i;
                }

            }
        return secondlargest;

    }



    
}
