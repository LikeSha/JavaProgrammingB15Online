package RtplSelfPractce;

import java.util.Scanner;

public class WeekPractice_28 {

    public static void main(String[] args) {
         //Create an object of Scanner class named scanner.
        //Create int variable named day.
        //Write an if statement that will print day of the week based on value of the day variable.
        //For example:
        //
        //if day = 1, then print "It's a Monday!"
        //or, if day = 5, then print "It's a Friday!"
        //
        //Otherwise (else), print "There is no such a day!"
        //
        //#################################################
        //
        //input: 1
        //output: It's a Monday!
        //
        //input: 7
        //output: It's a Sunday!


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number please ");
        int day = scan.nextInt();



        if (day == 1) {
            System.out.println("It's a Monday!");
        }
        if (day == 2) {
            System.out.println("It's a Tuesday!");
        }
        if (day == 3) {
            System.out.println("It's a Wednesday!");
        }
        if (day == 4) {
            System.out.println("It's a Thursday!");
        }
        if (day == 5) {
            System.out.println("It's a Friday!");
        }
        if (day == 6) {
            System.out.println("It's a Saturday!");
        }
        if (day == 7) {
            System.out.println("It's a Sunday!");
        }else if(day>7 || day <1){
            System.out.println("There is no such a day!");
        }






    }
}
