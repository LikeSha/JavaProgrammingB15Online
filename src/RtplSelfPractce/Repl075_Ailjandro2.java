package RtplSelfPractce;

import java.util.Scanner;

public class Repl075_Ailjandro2 {

    public static void main(String[] args) {

        /**as Alejandro is time is precious and even with his little knowledge of programming he managed to save some time.
         * but still he had a lot of emails to read.

         he wants to add more conditions to his program,
         he wants only job related mails so he will narrow it down by also checking if the word "project"
         also appears beside his name, that way he will be sure its a job email that refers to him.


         for example:

         a = "dear alejandro.....alot of text"

         outputs: "dont read"

         a = "thunder blaz is the best drink in the galaxy..."

         outputs: "dont read"

         a = "subject : important project, alejandro we refer to you  this ...."

         outputs: "read this mai
         *
         *
         *
         */

        Scanner s = new Scanner(System.in) ;
        System.out.println("check your name in email title");
        String a = s.nextLine();

        if(a.contains("alejandro") && a.contains("project")){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }

    }
}
