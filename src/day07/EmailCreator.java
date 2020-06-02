package day07;

import java.util.Scanner;

public class EmailCreator {

    public static void main(String[] args) {

        // Create 3 String variable for first name last name ,company
        // Create another variable for email
        // Create email in this format firsName_lastName@company.com

        // print out the result as , my name is <your full name > and I work for <company>
        // and my email is <email>

        /*
        Scanner scan = new Scanner(System.in);// THis part is finished by myself

        System.out.println("What is your first name ?" );
        String firstName = scan.next();
        System.out.println("Your first name is " + firstName);

        System.out.println("What is your last name ? ");
        String lastName = scan.next();
        System.out.println("Your last name is " + lastName);

        System.out.println("What is your company email ?");
        String companyEmail = scan.nextLine();
        System.out.println("Your company email is " + companyEmail );

        System.out.println("My name is " + (firstName + lastName)  +" and I work for XXX and " +
                "my company email is " + companyEmail + ".com" );

         */


        System.out.println("Enter your first name , last name , company separated by space :");
        String firstName = " Astrit";
        String lastName = "Enver";
        String company = "Verizon";
        String email = firstName + "_" + lastName + "@" + company + ".com";
        // firstName_lastName@company.com Astrit_Enver@Verizon.com

        System.out.println("My name is " + firstName  + " " + lastName + " and I work for " +
                company + " and my email is " + email );






    }
}
