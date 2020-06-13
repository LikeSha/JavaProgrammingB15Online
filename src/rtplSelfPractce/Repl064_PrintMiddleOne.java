package rtplSelfPractce;

import java.util.Scanner;

public class Repl064_PrintMiddleOne {

    public static void main(String[] args) {

       /** You have a word, do the following:

        1. When word has odd number of characters and:
        - 3 or more characters, print middle letter
        oak ==> a
        javav ==> v
        My logic : print wordl.length()/2 ;
               if  - Single character, print that character 3 times
      # ==> ###
        q ==> qqq
        my logic : loop it
        2. When word has even number of characters and:
         if- 4 or more characters, print middle 2
        java ==> av
        apples ==> pl
     #$%^&* ==> %^
        my logic : loop it find out middle one first ,example : if 6 words ,middle is 6/2
        if 8 wods : 8 /2 = 4 -->> words.length/2 and word.length/2 + 1
        - 2 characters, print those 2 characters twice
        @@ ==>@@@@
                $$ ==>$$$$
        hi ==> hihi

        my logic : if word.length ==2 print twice
            **/
        Scanner scan = new Scanner(System.in) ;

        System.out.println("Please enter any words");

        String word = scan.next();

        int wordCount = word.length();

        if(wordCount > 2 && (wordCount)%2==1){

            System.out.println(word.charAt(wordCount/2));

        }else if(wordCount > 2 && wordCount%2==0){

            int indexOffFirstHalf = wordCount/2-1;
            int indexOfSecondHalf = wordCount/2 ;

            System.out.println(word.charAt(indexOffFirstHalf) +""+ word.charAt(indexOfSecondHalf));

        }else if(wordCount==1){

            System.out.println(word + word + word);

        }else if(wordCount == 2){

            System.out.println(word + word);

        }


    }
}
