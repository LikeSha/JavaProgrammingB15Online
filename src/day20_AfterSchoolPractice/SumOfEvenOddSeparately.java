package day20_AfterSchoolPractice;

public class SumOfEvenOddSeparately {

    public static void main(String[] args) {

        // Give me the sum of odd numbers and even from 10--100 ues for loop
        // hint : create a variable sumOfOdd AND sumOfEven as int loop through 10 -100
        // in each iteration check it's a even number or not
        //if its add that number to sumOfEven
        //if its not even that number to sumOfOdd
        // eventually after the loop -->> print out sumOfOdd value and sumOfEven value

        int sumOfOdd = 0 ;
        int sumOfEven = 0 ;

        for (int i = 10; i <= 100 ; i++) {

            if(i%2==0){
                sumOfEven = sumOfEven + i ;
            }if(i%2==1){                  //  ------>                  else{
                sumOfOdd = sumOfOdd + i ; //                             sumOfOdd = sumOfOdd + i ;
            }

        }

        System.out.println("sum of even number is " + sumOfEven);
        System.out.println("sum of odd number is " + sumOfOdd);






    }
}
