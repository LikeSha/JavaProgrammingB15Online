package rtplSelfPractce;

import java.util.Scanner;

public class Repl064_PrintLastCharacter {

    public static void main(String[] args) {

        // Write a program that will print out last letter of the word (string).

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();

        // THIS QUESTION IS VERY IMPORTANT ! MUST REMEMBER

        System.out.println(word.substring(word.length()-1));

        // FIND OUT THE FIRST CHARACTER IS :
        // word.charAt(0)



    }
}
