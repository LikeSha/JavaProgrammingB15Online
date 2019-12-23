package day09;

import java.util.Scanner;

public class EveOddFinder {

    public static void main(String[] args) {

        // Task 1
        // Create a class called EvenOddFinder with main method
        // If a number Divided by 2 no remainder ,
        // It is even , remainder 1 is odd
        //
        // Write a program to find out a number is even or odd
        // Create a int variable called myNumber and assign a value

        //if the number is even then says this is a even number
        //if the number is odd then says this is an odd number

        // Task 2
        // Create a class called CitizenTypeChecker with main method
        // Create a variable called citizenType as String
        // And create a variable with age
        // If the age is more than 65, assign value of citizenType to Senior

        // Both tasks optionally use scanner

        // Task 1

        // teacher example :
        // int myNumber = 300 ;
        // int remainder = myNumber%2   // OR  ,JUST USE " myNumber%2
        //if ( remainder == 0)p[{
        //System.out.println (" EVEN NUMBER !!!");
        //}else{
        // System.out.println( " ODD NUMBER!!!")

        int myNumber = 300 ;

        int remainder = myNumber%2 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Is your number an odd number or an even number ?");

        if(remainder == 0){
            System.out.println(" this is an even number");
        }else {
            System.out.println("this is an odd number");
        }

    }



}
