package day16;

public class WakeUpTask1_Reverse {

    public static void main(String[] args) {


        // Task 1 :
        // Given a word with 4 characters
        //stored in a String variable word1
        //create a String variable called word2
        //store the reversed word1 into word 2 and print out
        //for example : if word1-->Java  word2 should be -->avaJ

        String word1 = "Java" ;
        String word2 = "";

        // in order to reverse a word , we need to take last character and put it
        // in first character
        // then put the second character at 1 location before first character
        // start getting character from last location till first location then save it
        // word2 = "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
//         word2 = word2 +word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        word2 +=  word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        System.out.println("word2 = " + word2);

//        int characterCount = word1.length() ;
//        int lastCharIndex = characterCount - 1 ;
//        char lastChar = word1.charAt(lastCharIndex);

        // I want to add word at the end of it
        String msg = "Hello" ;
        //msg = msg + "World!" ;
        msg += " World!";
        System.out.println("msg = "  + msg);









    }


}
