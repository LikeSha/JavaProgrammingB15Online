package rtplSelfPractce;

public class Repl0110_ArraysPrintFirstLastChar1 {

    public static void main(String[] args) {

        /**Given a String array words, iterate through each word and print first and last letter
         * of each element in separate lines.

         Example:

         words → ["hello", "why", "by", "apple" , "note"]
         print:
         ho
         wy
         by
         ae
         ne

         */

        String[] words = new String[]{"hello", "why", "by", "apple" , "note"} ;

        for (int i = 0; i < 5 ; i++) {

            System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1));

        }


    }
}
