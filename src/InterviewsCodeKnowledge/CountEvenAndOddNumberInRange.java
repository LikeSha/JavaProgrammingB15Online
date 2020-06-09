package InterviewsCodeKnowledge;

public class CountEvenAndOddNumberInRange {

    public static void main(String[] args) {

        //  write a program to print out all even and odd number from 0 to 50 ;

        int cnt = 0 ;

        while( cnt <= 50){

            if( cnt %2 ==0){
                System.out.println( cnt + " is even number");
            }else{
                System.out.println( cnt + " is odd number");
            }
            ++cnt ;


        }



    }
}
