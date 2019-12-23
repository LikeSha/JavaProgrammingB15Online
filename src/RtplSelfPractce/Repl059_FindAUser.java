package RtplSelfPractce;

import java.util.Scanner;

public class Repl059_FindAUser {

    public static void main(String[] args) {

        /**Write a program that will look up for user.
         *Assume that you have only 2 users: Max Payne and Alan Wake.
         * First, ask user to enter full name. Display message: "Enter full name:".
         * Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",
         * display message: "User found!". Otherwise,  display message: "User not found!".
         * Please make your search case insensitive!
         *
         * Example:
         * Display message: Enter full name:
         * input: Max Payne
//         * Display message: User found!

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();

        if(name1.equalsIgnoreCase("Max Payne") || name1.equalsIgnoreCase("Alan Wake")){

            System.out.println("User found!");

        }else if(name2.equalsIgnoreCase("Max Payne") || name2.equalsIgnoreCase("Alan Wake")){

            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }




    }





}
