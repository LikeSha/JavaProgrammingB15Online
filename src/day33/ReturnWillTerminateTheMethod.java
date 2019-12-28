package day33;

import java.util.Scanner;

public class ReturnWillTerminateTheMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number more than 10 ");

        int num = scan.nextInt();
        // YOU CAN NOT USE return Keyword to get out of the method
        // in void methods ,as long as you don't actually return a value
        // below line is only ting you can do !  return ==> break ;  in void methods
        if(num<10){
            return ;
        }

        System.out.println("Happy Holidays");
        System.out.println("2 days off!!!yay");


    }
}
