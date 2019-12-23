package office_hour;

import jdk.swing.interop.SwingInterOpUtils;

public class Practice_12_04_repl64 {

    public static void main(String[] args) {
      /*
         You have a word, do the following:

         1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
            oak ==> a
            javav ==> v
             - Single character, print that character 3 times
            # ==> ###
            q ==> qqq

       2. When word has even number of characters and:
           - 4 or more characters, print middle 2
           java ==> av
           apples ==> pl
           #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
           @@ ==>@@@@
           $$ ==>$$$$
           hi ==> hihi

      // My logic : 1 of many ways to solve this problem

      if single character ---> print that character 3 times
      if 2 character ---->> print those 2 characters twice
      if odd number of characters and 3 or more characters
         --->> get teh middle one : lengthOfYourWorld/2
         --->> example ," today"  has 5 characters   5/2=2
                          01234
       if even number of characters and 4 more characters,
          --->> print middle 2
          0123     4/2=2                012345  6/2=3
          word     2-1, 2---OR          KAMRAN  3-1,3--->MR
        **/

        String  word = "abcdefgh" ;

        int charCount = word.length();

        if(charCount==1){

            System.out.println(word + word + word);

        }else if(charCount==2){

            System.out.println(word + word);

        }else if(charCount>2){
            // if the word character count is more than 2 then I worry about it's even or odd
            if(charCount%2==1){

                System.out.println(word.charAt( charCount/2));
            }else{

                int indexOffFirstHalf = charCount/2-1;
                int indexOfSecondHalf = charCount/2 ;

                System.out.println( word.charAt(indexOffFirstHalf) + "" + word.charAt(indexOfSecondHalf));

            }
        }






    }
}
