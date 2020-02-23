package rtplSelfPractce;

import java.util.Scanner;

public class Repl073_MiddleThree {

    public static void main(String[] args) {

        /**You have a word, do the following:

         If the word has odd number of characters
         and has 5 or more characters, print the middle three
         characters of the word.

         Otherwise print "invalid".

         fifteen ==> fte
         apple ==> ppl
         hey ==> invalid
         java ==> invalid
         whatsup ==> ats
         $ ==> invalid
         *
         *
         *
         */
        Scanner scan = new Scanner(System.in) ;
        System.out.println("ENTER A WORD");
        String word = scan.next() ;
        int wordCount = word.length();

        if(wordCount %2 == 1 && wordCount >=5){

            int indexOffFirstHalf = wordCount/2-1;
            int indexOfSecondHalf = wordCount/2 ;

            System.out.println(word.charAt(indexOffFirstHalf) +"" + word.charAt(indexOfSecondHalf ) +"" + word.charAt(indexOfSecondHalf+1));



        }else{

            System.out.println("invalid");
        }

        }
    }
