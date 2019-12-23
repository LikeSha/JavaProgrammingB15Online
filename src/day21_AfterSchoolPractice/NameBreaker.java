package day21_AfterSchoolPractice;

public class NameBreaker {

    public static void main(String[] args) {

        /**Task X
         * Store your name into a variable name
         * loop through each and every letters
         * and print
         * if you see letter b-->> get out of the loop

         */

        String name= "salik mablik";
        int charCount = name.length();
        int lastCharIndex = charCount-1 ;

        for (int x = 0; x < charCount ; x++) {

            String currentChar = name.substring(x, x + 1);
            if(currentChar.equalsIgnoreCase("b")){
                System.out.println("got it !!!");
                break ;
            }
            System.out.println(currentChar);

        }

    }
}
