package RtplSelfPractce;

import java.util.Arrays;
import java.util.Scanner;

public class Repl109_ArraysPrinting1 {

    public static void main(String[] args) {

        /**The code provided in your main method will take in five Strings and save them into an array called arr.
         *  Print out the first three letters of each element of arr, one per line.
         * You can assume that every element of arr iat least 3 letters long.
         *
         *Example:
         * arr -> ["apple", "banana"]
         *  prints: app
         *          ban
         * Hint: How do you get the first 3 letters of any String starting from index 0 till right before index 3?
         *
         */

        Scanner scan = new Scanner(System.in) ;

        System.out.println("enter 5 words ,each word at least 3 characters");

       // String word = scan.nextLine();

        String[] items = new String[]{"hat" , "socks" , "pants" , "gloves" , "shirts"};
        System.out.println(Arrays.toString(items)) ;


        for (int i = 0; i <items.length ; i++) {


            System.out.println(items[i].substring(0,3));

        }




    }
}
