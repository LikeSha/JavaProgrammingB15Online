package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {

    public static void main(String[] args) {


        // Array MUST be converted to String to print

        int num =10 ;
        int[] arr = {10,20,30,40,50,60};
        //length: returns the total number of elements from the array
           // last index num : arr.length-1
        // int num1 = arr[arr.length-1];


        // print : expected 10 20 30 40 50 60
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");

        }





        //Array.toString()
       String str = Arrays.toString(arr) ;
        System.out.println(str);

        // Task 01 :
         // write a program that asks user to enter a number 5 times , and store
        // those numbers into array
        int[] numbers = new int[5];  // array size is fixed ,you must be initialized first before
         //numbers[0] = 5 ;               // we use it !
        System.out.println(Arrays.toString(numbers));

        Scanner scan = new Scanner(System.in) ;


        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter an int number");
        // int input = scan.nextInt() ; // returns int data type
        numbers[i] = scan.nextInt() ; // this action need to be repeated 5 times

        }
        System.out.println(Arrays.toString(numbers));

        // Array.sort(variableName) : sorts the array in ascending order ,
         // this method use to find out largest number in an array.
        Arrays.sort(numbers) ;

        int largestNumber = numbers[numbers.length -1 ] ;
        int minNumber = numbers[0] ;
        System.out.println("Minimum number is " + minNumber );
        System.out.println("Largest number is " + largestNumber);

        // write  a program that can fin the minimum numbers from an
        // int array  // find out largest and minimum number is interview
        //question !







    }
}
