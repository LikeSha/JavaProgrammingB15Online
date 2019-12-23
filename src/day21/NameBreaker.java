package day21;

public class NameBreaker {

    public static void main(String[] args) {

        /**Task X
         * Store your name into a variable name
         * loop through each and every letters
         * and print
         * if you see letter b-->> get out of the loop

         */
        //             012345678
        String name = "Nursultan";
        int charCount = name.length();
        int lastCharIndex = charCount - 1;

        for (int i = 0; i < charCount; i++) {

            String currentChar = name.substring(i, i + 1);
            if (currentChar.equalsIgnoreCase("l")) {
            // if(name.substring(x.x+1).equalsIgnoreCase(anotherString:"l")){
                System.out.println("FOUND IT!!");
                break;


                //  teachers solution :
                // String name = "Nursultan" ;
                //// for( int x = 0 ; x < name.length() ; x ++){
                //    char currentChar = name.charAt(x);
                // System.out.println ( currentChar )
                // if(currentChar == 'l') {
                //  System.out,println ( "FOUND IT!!")
                //  break ;
          //  }
                // System.out.println( currentChar) ;


            }
            System.out.println( currentChar);

        }
    }
}