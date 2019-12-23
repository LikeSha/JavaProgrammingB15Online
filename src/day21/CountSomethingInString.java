package day21;

public class CountSomethingInString {

    public static void main(String[] args) {

        // find out the count of all the word lia in cases insensitive manner
        // I will go through each and every letter of the String by 3 character -->for loop
        //   --->> each 3 characters I can use substring (0,2) and so on
        //    --->> going to 0 to three characters before last index--->> for loop
        // while I am going through each and every 3 character
        // I will check whether current character I am looking at
        // equals to  lia in case insensitive  -->> currentCharacter.equalsIgnoreCase("lia")
        // it it is I will add i to my   println( the variable you use to keep the index)
        // if not -->> just move on
        // perform this action until I reach last character  if I go over last  character index I stop


        String myName = "Amelia Israfil Hajitev mehmet Hajitev Amelia Ashr Behlia ";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        int counter = 0;
        //  for (int x = 0; x <= charCount-3 ; x++) {
        for (int x = 0; x <= lastCharIndex - 2; x++) {

            // saving the current 3 characters
            String current3Char = myName.substring(x, x + 3);
            if (current3Char.equalsIgnoreCase("lia")) {

                counter++ ;


            }
        }
        System.out.println("counter = " + counter);

    }
}