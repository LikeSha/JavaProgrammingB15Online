package day19;

import java.util.Scanner;

public class WarmUp_SpeedUpOrDown_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("You have started at speed -->>");
        for (int i = start; i <= end; i++) {// the value i is only accessable in for loop
            // because its you declared inside it,the idea is
            // I dont want to chang the start and end value in here

            System.out.print(i + " , ");


        }

    }
}