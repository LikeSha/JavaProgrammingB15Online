package InterviewsCodeKnowledge;

public class SumOfOddEvenSeparately {

    public static void main(String[] args) {

        // Give me the sum of odd numbers and even from 10--100 ues for loop
        // hint : create a variable sumOfOdd AND sumOfEven as int loop through 10 -100
        // in each iteration check it's a even number or not
        //if its add that number to sumOfEven
        //if its not add that number to sumOfOdd
        // eventually after the loop -->> print out sumOfOdd value and sumOfEven value

        int sumOfEven = 0 ;
        int sumOfOdd = 0 ;

        for (int i = 10; i <= 100 ; i++) {

            if( i%2==0){
                sumOfEven = sumOfEven + i ;

            }else{
                sumOfOdd = sumOfOdd + i ;
            }


        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);


    }
}
