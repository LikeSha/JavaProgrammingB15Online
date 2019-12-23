package day05;

import java.util.Scanner;

public class TimeConverter {
    /*
    Task 3 :
    * Create an interactive program to ask user for day
    * and generate minute that day have
     **/


    /*
    Task 4 :
    * Create an interactive program to ask user for hourly wage
    * and generate yearly salary
       assume that he works 2080 hour for a year
     **/

    /*
    Task 5 : Grocery Shopping
    * ask user whats the price of tomato and store it
    * ask user how many tomato you want to buy and store it
    * ask user whats the price of potato and store it
      ask user hwo many potato you want to buy and store it
    *   ask user whats the price of banana and store it
      ask user hwo many banana you want to buy and store it

      generate this example output
      You got 3 tomato price is 2.99 and total-->>
      You got 5 potato price is 3.49 and tota-->>
      You got 2 banana price is 1.99 and total -->>

     **/
    /*
    Task 6 :
            /* Create an interactive program to ask user for hourly wage
    * and generate yearly salary
    assume that he works 2080 hour for a year
     **/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many minutes an hour ?");
        int Hour = scan.nextInt();
        int minutesPerHour = (60*1);
        System.out.println( " How many minutes a day ?");
        int minutes  = scan.nextInt();
        int minutesPerDay = ( 24*60);

        System.out.println("One day equals " + minutesPerDay + " minutes");







    }
}
