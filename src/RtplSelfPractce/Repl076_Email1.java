package RtplSelfPractce;

import java.util.Scanner;

public class Repl076_Email1 {

    public static void main(String[] args) {

        /**In this task, you need to swap first name with last name in the email.
         * If email doesn't contains underscore - do not anything.

         Example:
         input: mike_tyson@gmail.com
         output: tyson_mike@gmail.com

         Example:
         input:
         output: barakobama@gmail.com
         *
         *
         *
         */
        Scanner scan = new Scanner(System.in) ;
        System.out.println("PLEASE ENTER EMAIL");
        String email = scan.nextLine();


        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1,email.indexOf("@") );

        if(email.contains("_")){

            System.out.println(lastName + "_" + firstName + "@gmail.com");

        }else{

            System.out.println(email);
        }


        // Jordan mentoring version
        System.out.println("======Jordan version=======");
         String firstName1 = "" , lastName1 = "" ;
        if(email.contains("_")){
            firstName1 = email.substring(0,email.indexOf("_"));
            lastName1 = email.substring(email.indexOf("_") + 1,email.indexOf("@")) ;

            email.replace(lastName1,firstName1);
            email.replace(lastName1,firstName1);

        }
        System.out.println(email);




    }
}
