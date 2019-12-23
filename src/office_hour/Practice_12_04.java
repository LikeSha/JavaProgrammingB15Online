package office_hour;

import java.util.Scanner;

public class Practice_12_04 {

    public static void main(String[] args) {


        // HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        //IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER Z A, or A K
        // Can we ask user character ? NO!!!
        //Ask user for String and pick character by charAt()

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter 1st word with a single character ");
        String first = scan.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 2nd word with a single character ");
        String second = scan.next();
        char secondAsChar = second.charAt(0);
        // user enter A for first part
        // user enter C for second part
        // expected result should be A B C

        // user enter D for first part
        // user enter A for second part
        // expected result should be D B C A

        for(char iChar = firstAsChar ;  iChar<= secondAsChar ; iChar++){

           System.out.print( iChar + " ");
        }

       //Second version is below
        // what if we dont want to include users staring and ending point ?







    }





}
