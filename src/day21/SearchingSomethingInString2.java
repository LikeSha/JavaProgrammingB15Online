package day21;

public class SearchingSomethingInString2 {

    public static void main(String[] args) {

        // find out index of all the word an in cases insensitive manner
        // I will go through each and every letter of the String by 2 chars-
        //   --->> each character I can use substring (0,2) and so on
        //    --->> going to 0 to one character before last char index--->> for loop
        // while I am going through each and every 2 character
        // I will check whether current character I am looking at
        // equals to an in case insensitive  -->> currentCharacter.equalsIgnoreCase("an")
        // if it is I will print the index  println( the variable you use to keep the index)
        // if not -->> just move on
        // perform this action until I reach one character before last
        // character
        // because last chance to get 2 characters is right before last character


        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);


        //for (int x = 0; x < charCount ; x++) {
        for (int x = 0; x <= lastCharIndex - 1; x++) {

            String current2Char = myName.substring(x, x + 2);
            if (current2Char.equalsIgnoreCase("ma")) {


                System.out.println("The index of an is " + x);
            }


        }

        System.out.println("---------------");
        System.out.println("---3 chars------");
        for (int x = 0; x <= lastCharIndex - 2; x++) {

            String threeChar = myName.substring(x, x + 3);
            if (threeChar.equalsIgnoreCase("mam")) {


                System.out.println("The index of an is " + x);
            }

        }




    }

}