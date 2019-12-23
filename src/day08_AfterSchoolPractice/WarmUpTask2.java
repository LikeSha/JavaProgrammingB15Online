package day08_AfterSchoolPractice;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        /*
         * Create a program to guess your favorite number
         * create a variable called myFavoriteNumber as int
         * Ask user to guess your favorite number
         * if user guessed right  300 then print BINGO !!
         * if not print try again later
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Guess what is my favorite number ");
        int myFavoriteNumber = scan.nextInt();

        if(myFavoriteNumber == 300){
            System.out.println("BINGO!!");
        }else{
            System.out.println(" Try again later");


        }
    }
}