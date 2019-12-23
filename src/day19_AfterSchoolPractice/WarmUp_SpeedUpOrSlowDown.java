package day19_AfterSchoolPractice;

import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown {

    public static void main(String[] args) {

        // Create 2 class called SpeedAction
        // Create 2 int variable s called start , end

        // assuming start > end
        // Create a for loop to stimulate slow increase of the speed

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your start speed and end speed");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if(start<end){

            System.out.println("Your are increasing your speed");
            for (int i = start; i <= end; i++) {

                System.out.print( start + ",");

            }
        }else if(start>end){

            System.out.println("You are decreasing your speed");
            for (int x = start; x >= end ; x--) {

                System.out.print( x + " , ");
            }
        }else{

            System.out.println(" speed no change ");
        }




    }
}
