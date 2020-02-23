package rtplSelfPractce;

import java.util.Scanner;

public class Repl070_PrintTheLongestWord {

    public static void main(String[] args) {

        //Write a program that will print out the longest word.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two words");

        String word1 = scan.next();
        String word2 = scan.next();

        if(word1.length() > word2.length()){
            System.out.println(word1 );
        }else if(word2.length() > word1.length()){
            System.out.println(word2 );
        }



    }
}
