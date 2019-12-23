package day06_AfterSchoolPractice;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        //System.out.println("What is your name ? ");
        // nextLine method of Scanner is used to capture whole line

        //String name = blabla.nextLine();

        //System.out.println("You have entered " + name);

        // Task 4
        // use nexLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson , VA
        // What is your street address

        System.out.println("What is your name ?");
        String name = blabla.nextLine();
        System.out.println("your name is " + name) ;

        System.out.println("Where are you living in ?");
        String cityState = blabla.nextLine();
        System.out.println("You said you are living in " + cityState );

        System.out.println("What is your street address ? ");
        String streetName = blabla.nextLine();
        System.out.println("You said your address is " + streetName );









    }
}
