package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        // + - * / %
        // % this is another operator along with others
        // it's called modulus or remainder operator
        // it will give you the remaining result after
        // two whole number

        System.out.println(5/2);//2

        System.out.println( 5.0/2 );//2.5 larger type primitive always win in this case Double win

        System.out.println( 5/2f );//2.5 larger type primitive always win in this case Double win

        System.out.println("--- modulus , remainder ---");
        // 5 divided by 2 is 2 and remainder is 1
        // 2*2 + 1 = 5
        System.out.println( 5 % 2 );//1
        // 10*9 + 9 = 99
        System.out.println( 99 % 10 );//9

        System.out.println( 100 % 10 );//0

        // declare a variable called minutes, data type int
        // ask user to enter minutes as whole number
        //print the result in x hour y minutes format
        // for example 135 minutes , 2 hours 15 minutes

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the minute you want to convert ");
        int minutes = scan.nextInt();  // 135 ; // 60*2 + 15



        int hourPart = minutes / 60 ;  // 135/60 //--->> 2
        int minutesPart = minutes %60;    // 135%60 //--->> 15

        System.out.println(" The minutes " + minutes + " is " +  hourPart + "hours and " + minutesPart + " minutes ");


//           Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the minutes you want to convert");
//        int minutes = scan.nextInt();
//
//        int hourPart = minutes/60;
//        int minutesPart = minutes%60;
//
//        System.out.println( minutes + " minutes is " + hourPart + " hours and " +
//                minutesPart + " minutes ");
//









    }
}
