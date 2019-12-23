package RtplSelfPractce;

import java.util.Scanner;

public class Repl119ArraysSplitEmail {

    public static void main(String[] args) {

        /**Given a String variable email, write code using split method to print email id and domain in separate lines.

         Example:
         email -> info@cybertekschool.com
         Print:
         Email id: info
         Email domain: cybertekschool.com


         If email contains no @ character or multiple @ characters then print invalid email:

         email -> hello-gmail.com
         print:
         invalid email

         email -> my@fancy@email.com
         print:
         invalid email
         *
         *
         */
           Scanner input = new Scanner(System.in) ;
           System.out.println("Enter email");

           String email = input.next() ;
           String[] emailSplitted = email.split("@");
           String emailId = emailSplitted[0];
           String emailDomain = emailSplitted[1];
          // int countOfSymbol = 0 ;

           if(email.contains("@") && emailSplitted.length == 2){
               System.out.println("Email id: " +emailId);
               System.out.println("Email domain: " +emailDomain);
           }else {
               System.out.println("invalid email");
           }


    }
}
