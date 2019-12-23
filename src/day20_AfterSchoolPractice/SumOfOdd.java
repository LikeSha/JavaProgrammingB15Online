package day20_AfterSchoolPractice;

public class SumOfOdd {

    public static void main(String[] args) {


        // Create a class called SumOfOdd
        // Give me the sum of odd numbers from 10--100
        // in each iteration check it's a odd number or not
        //if its add that number to num
        // eventually after the loop -->> print out sum value

        int sum= 0 ;

        for (int i = 10; i <= 100 ; i++) {

            if(i%2==1){
                sum= sum + i;
            }

        }

        System.out.println("sum = " + sum);


    }
}
