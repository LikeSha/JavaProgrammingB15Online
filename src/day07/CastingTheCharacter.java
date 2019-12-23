package day07;

import jdk.swing.interop.SwingInterOpUtils;

public class CastingTheCharacter {

    public static void main(String[] args) {

    char grade = 'B';
        System.out.println(grade);

        // 'B' is represented by 66 in ascii table
        // here type char is automatically widened to int
        // and stored as number

        int letterInNumber = 'B';

        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        /*
        //---------------------------------

        char myFirstChar = (char)100 ;
        System.out.println(myFirstChar);

        int myFirstName1 = 's' ;
        int myFirstName2 = 'a';
        int myFirstName3 = 'l';
        int myFirstName4 = 'i';
        int myFirstName5 = 'k';
        System.out.println( " My  First name in ASCII code is " + myFirstName1 + " " + myFirstName2 + " " +
                 " " + myFirstName3 + " " + myFirstName4 + " " +myFirstName5);

         */


         char letterA = 'a';
         // adding a character to a int number will result in int
        // (int) letterA + 1
        System.out.println( letterA + 1 );

        System.out.println(" " + letterA + 1);







    }
}
