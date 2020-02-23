package nov27_Day15_StringMethodTask;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        //TASK 7
        //Ask user to enter valid email address
        //for example :
        //01234567890123456789
        //JSnow@NightWatch.com or
        //ARYA@KingsLanding.edu
        //Print 3 part of the email separately
        //for example :
        //Part1->JSnow Part2->NightWatch Part3->com
        //Part1->Arya  Part2->KingsLanding Part3->edu

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email part before @");

        String email =scan.nextLine();


        int findAT = email.indexOf("@");
        String part1 =email.substring(0,findAT);
        System.out.println("First part of email is "  + part1);

        int pointLocation = email.indexOf(".");// pointLocation logic is find out "."==pointIndex
        String part2 = email.substring(findAT + 1,pointLocation);
        System.out.println("Second part of email is " + part2);

        String part3 = email.substring(pointLocation+1);
        System.out.println("Third part of email is " + part3);

        System.out.println("You have entered " + part1);













    }
}
