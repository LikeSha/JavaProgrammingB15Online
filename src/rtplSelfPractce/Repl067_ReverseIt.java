package rtplSelfPractce;

import java.util.Scanner;

public class Repl067_ReverseIt {

    public static void main(String[] args) {

        /**Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
         * If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
         * Otherwise, reverse this word and print out result into the console.

         Example:
         input: cat
         output: Too short!

         Example:
         input: singularity
         output: Too long!

         Example:
         input: apple
         output: elppa

         */

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Please enter a word with only 5 character");

        String word = scan.next();

        if(word.length() < 5 ){

            System.out.println("Too short!");

        }else if(word.length() > 5 ){

            System.out.println("Too long!");

        }else if(word.length() == 5){

            String reversedWord = "";
            //int lastCharIndex = word.length() - 1 ;

            for (int x = 4; x >= 0 ; x--) {

                char currentChar = word.charAt(x);
                //System.out.println( word.charAt(x));

                reversedWord = reversedWord + currentChar;

            }
            System.out.println("reversedWord = " + reversedWord);





        }

    }
}
