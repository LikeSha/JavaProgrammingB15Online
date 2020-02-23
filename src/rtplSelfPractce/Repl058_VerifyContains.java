package rtplSelfPractce;

import java.util.Scanner;

public class Repl058_VerifyContains {

    public static void main(String[] args) {

        /**
         *Write a program that will verify if word contains in the sentence. Print out the result as boolean value.

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("please write a sentence");
        String sentence = scan.nextLine();
        String word = scan.nextLine();


        if(!sentence.contains("word")){
            System.out.println(false);
        }else{
            System.out.println(true);
        }







    }
}
