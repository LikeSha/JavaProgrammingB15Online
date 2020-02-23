package rtplSelfPractce;

import java.util.Scanner;

public class Repl066_MergeThem {

    public static void main(String[] args) {

        /**You have 2 words, both of them have 3 characters.
         If either of them does not have exactly 3 characters, print "cannot merge"
         Merge their characters one by one and print together like below:

         aok
         lol
         alookl

         ear
         pie
         epaire

         java
         wow
         cannot merge

         hint:
         by inserting +""+ (empty string) between chars, you can concatenate char values.

         **/

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Please enter two words , each word has 3 characters");

        String word1 = scan.next();
        String word2 = scan.next();

        if(word1.length()!=3 || word2.length()!= 3){

            System.out.println("cannot merge");

        }else {

            System.out.println(word1.charAt(0) +"" + word2.charAt(0) +"" +word1.charAt(1)
             +"" + word2.charAt(1) + word1.charAt(2) + "" + word2.charAt(2));
        }

    }
}
