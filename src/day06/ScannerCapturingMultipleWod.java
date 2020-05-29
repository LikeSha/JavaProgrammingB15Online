package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWod {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        //System.out.println("What is your name ?");
        //nextLine method of Scanner is used to capture whole line

       // String name = blabla.nextLine();

       // System.out.println("You have entered " + name);

        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state, Tyson, VA
        // what is your street address

        System.out.println("What is your name ?");
        String name = blabla.nextLine();
        System.out.println("You have entered " + name);

        System.out.println("Which city are you living in ? Including state .");
        String cityAndState = blabla.nextLine();
        System.out.println("You have entered " + cityAndState);

        System.out.println("What is your street address ?");
        String streetAddress = blabla.nextLine();
        System.out.println("Your street address is " + streetAddress);






    }
}
