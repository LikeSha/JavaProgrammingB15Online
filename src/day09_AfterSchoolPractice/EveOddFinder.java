package day09_AfterSchoolPractice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EveOddFinder {

    public static void main(String[] args) {

        //   Task 1
        //        // Create a class called EvenOddFinder with main method
        //        // If a number Divided by 2 no remainder ,
        //        // It is even , remainder 1 is odd
        //        //
        //        // Write a program to find out a number is even or odd
        //        // Create a int variable called myNumber and assign a value
        //
        //        //if the number is even then says this is a even number
        //        //if the number is odd then says this is an odd number

        int myNumber = 89 ;

        Scanner scan = new Scanner(System.in);

        if(myNumber%2==0){
            System.out.println(" This is an even number");
        }else{
            System.out.println("This is an odd number");
        }



    }



}
