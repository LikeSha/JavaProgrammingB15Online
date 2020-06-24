package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {

    /* Array : a variable that allows us to store multiple values
    Array MUST be converted to String to print

    declaration :
           Data-Type[] variableName = {data1,data2,....}
           each of the data, the data type must same with Data-Type
           String array is String , int array is int.....

            regular variable:
           we can only store one single value   int a = 10;
           array variables : int[] arr = {1,2,3};
                            index:        0 1 2
         Array MUST be converted to String to print

         retrieve data : arrName[indexNumber]  ==> return the element of that index number
         EX: arr[2] ===> returns number 3

     */


    public static void main(String[] args) {


        int num =10 ;
        int[] arr = {10,20,30,40,50,60};
        //length: returns the total number of elements from the array
           // last index num : arr.length-1
        // int num1 = arr[arr.length-1];


        // print : expected 10 20 30 40 50 60
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");

        }

        //Array.toString(VariableName)
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

        // write  a program that can find the minimum numbers from an
        // int array  // find out largest and minimum number is interview
        //question !









    }
}
