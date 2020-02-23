package rtplSelfPractce;

import java.util.Scanner;

public class Repl120_ArraysFindingMaxLengthInStringArray {

    public static void main(String[] args) {

        /**Given the array words, it will print the word with the largest length.
         * Assume that there are no 2 words with longest length

         Example:
         words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
         prints jaaaaavvaaaaaaaaaa
         *
         */
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        String longestWords = "" ;

        System.out.println("enter words");

        for(int i = 0; i < 5;  i++) {

          words[i] = input.nextLine();
            for (int j = 0; j < 5 ; j++) {
                String word = words[j];

                if(words[j].length() > longestWords.length()){
                    longestWords = words[j];
                }
            }
        }

        System.out.println("longestWords = " + longestWords);


        /**another solution for each loop written by Omer Sanlialp
         *
         * Scanner input = new Scanner(System.in);
         *         String[] words = new String[5];
         *         for(int i = 0; i < 5;  i++) {
         *
         *             words[i] = input.nextLine();
         *
         *         }
         *
         *         //write your code below
         *         String max="";
         *         for(String word:words){
         *             if(word.length()>max.length()){
         *                 max=word;
         *             }
         *         }
         *
         *         System.out.println(max);
         *
         *
         */




    }
        }





