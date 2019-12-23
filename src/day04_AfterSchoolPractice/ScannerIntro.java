package day04_AfterSchoolPractice;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // I want to save users input after asking some questions
        // and I want to save this input so I can do something with it

        // Step 1 : Use Scanner class to create scanner object
                    //  that have this functionality
        Scanner scan = new Scanner(System.in);
        // ask user to enter name
        System.out.println( "Enter your first name please:");

        //capture what user typed on keyboard in console for name
        // scan.net() is for capturing single word that user entered

        String firstName =  scan.next();
        // print the result of what we saved from user input
        System.out.println(" Your have entered :" + firstName);

        // ask question from user before entering
        System.out.println(" what is our age :");
        // capture what user typed on keyboard in console for age

        // scan.net()Int is for capturing single number that user entered
        int age = scan.nextInt();
        // print the result of users age
        System.out.println(" your age is :" + age);


    }
}
