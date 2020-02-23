package rtplSelfPractce;

import java.util.Scanner;

public class Repl038_Words {

    public static void main(String[] args) {
        /**
         * in this assignment you are given two string variables word1 and word2.
         * you need to check if they are equal using an if.
         *
         * Comparison should be case sensitive. "java" and "JaVa" are not equal.
         *
         * if they are equal output  "word1 equals word2"
         * else output "word1 does not equal word2"
         *
         * for example:
         * word1="java"
         * word2="java"
         *
         * output:
         * "word1 equals word2"
         *
         * word1="foo"
         * word2="bar"
         *
         * output:
         * "word1 does not equal word2"

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input two words");

        String word1 = scan.next();
        String word2 = scan.next();

        if(word1.equals(word2)){

            System.out.println("word1 equals word2");

        }else{
            System.out.println("word1 does not equal word2");
        }




    }
}
