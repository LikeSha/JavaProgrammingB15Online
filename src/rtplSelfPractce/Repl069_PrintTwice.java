package rtplSelfPractce;

import java.util.Scanner;

public class Repl069_PrintTwice {

    public static void main(String[] args) {

        /**Write a program that will print out first half of the word twice.
         *
         * my logic : 1) if a word is odd number , find the middle one , the middle one
         * is  word.lengh()/2
         * 012
         * eat-->>   length / 2 = 1.5 ( in java = 1 ) --> first half is  index of 0 and 1
         * 01234
         * movie     length /2 =2.5( in java is 2) --> first half is index of 0,1,2
         *
         * 2) if the word is an even number word :
         * 0123
         * java      length /2 = 2 --->> first half is index of 0 and 1
         * 012345
         * cookie    length / 2 = 3 --->> first half is index of 0,1,2

         Example:

         input: java
         output: jaja
         *
         *
         */

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter a word");

        String word = scan.next();

        int wordCount = word.length();

        int middleIndex = wordCount/2; ; ;
        if(wordCount%2==1){

            System.out.println(word.substring(0,wordCount+1));

        }else if(wordCount%2 == 0) {

            System.out.println(word.substring(0,wordCount));
        }


    }
}
//int indexOfSecondHalf = wordCount/2 ;