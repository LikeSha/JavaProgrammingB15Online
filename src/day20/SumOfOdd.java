package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        // Create a class called SumOfOdd
        // Give me the sum of odd numbers from 10--100
        // in each iteration check it's a odd number or not
        //if its add that number to num
        // eventually after the loop -->> print out sum value

        int sum = 0 ;
        for(int x= 10 ; x <= 100 ; x++){

            // if (x %2 !=0)
            if( x %2 == 1){
               // System.out.println(x);
                sum = sum + x ;
            }

        }
        System.out.println("sum = " + sum);



        }
    }
