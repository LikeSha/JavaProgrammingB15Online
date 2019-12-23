package RtplSelfPractce;

import java.util.Arrays;
import java.util.Scanner;

public class Repl118_ArraysPrinting03 {

    public static void main(String[] args) {

        /**The code provided in your main method will take in six Strings and save them into an array called arr.
         Print out the 3 neighboring items of array in one line until the last line
         each line should contain 3 neighboring items of array element as displayed below
         user for loop

         Example:
         arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
         prints:  apple , banana , kiwi
         banana , kiwi , grape
         kiwi , grape , milk
         grape , milk , soda

         */

        String[] arr = new String[]{"apple", "banana", "kiwi", "grape", "milk", "soda"};
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < 4; i++) {

            System.out.println(arr[i] + " , " + arr[i + 1] + " , " + arr[i + 2]);


        }


    }

}




       /**for (int i = 0; i < 3; i++) {

        System.out.println(grocery[i] + " " +grocery[i + 1] + " " + grocery[i + 2]);


        }


          **/




