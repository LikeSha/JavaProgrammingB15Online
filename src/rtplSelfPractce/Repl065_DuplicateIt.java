package rtplSelfPractce;

import java.util.Scanner;

public class Repl065_DuplicateIt {

    public static void main(String[] args) {

        /**You have 2 words
         Print the first word, second word, second word, first word

         Input:
         one
         two
         Output:
         onetwotwoone

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two words");

        String word1 = scan.next();
        String word2 = scan.next();



        System.out.println(word1 + word2 + word2 + word1);


    }
}
