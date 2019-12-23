package RtplSelfPractce;

import java.util.Scanner;

public class Repl072_StringNoEnd {

    public static void main(String[] args) {

        /**in this exercise you get a string called txt .

         output txt without its last letter.

         for example:

         txt = "foo"

         output will be:
         fo

         hint
         use substring() and length() togather to solve this.
         substring will start at 0 and will end at txt length -1

         */

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter a word");

        String txt = scan.next();

        System.out.println(txt.substring(0,txt.length()-1));


    }
}
