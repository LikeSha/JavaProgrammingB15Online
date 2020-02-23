package rtplSelfPractce;

import java.util.Scanner;

public class Repl077_Email2 {

    public static void main(String[] args) {

        /**Write a program that will print out information about user based on email.
         * Print first and last name from the upper case.

         Example:
         Input: craig_federighi@apple.com
         Output:
         First name: Craig
         Last name: Federighi
         Domain: apple
         Top-Level Domain: com
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));
        String firstNameFirstLetter = firstName.substring(0,1).toUpperCase();
        firstName =firstName.replace(firstName.substring(0,1),firstNameFirstLetter);
        System.out.println("First name : " + firstName);


        String lastName = email.substring(email.indexOf("_" + 1),email.indexOf("@")) ;
        String lastNameFirstLetter = lastName.substring(0,1).toUpperCase();
        lastName = lastName.replace(lastName.substring(0,1),lastNameFirstLetter);
        System.out.println("Last name : " + lastName);



        String domain = email.substring(email.indexOf("@") +1,email.indexOf(".")) ;
        System.out.println("Domain : " + domain);


        String toplevel = email.substring(email.indexOf(".+1")) ;
        System.out.println("Top-Level Domain:" + toplevel);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(domain);
        System.out.println(toplevel);



    }
}
