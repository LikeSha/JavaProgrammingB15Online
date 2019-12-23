package day19;

import jdk.swing.interop.SwingInterOpUtils;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has it's corresponding ascii value
        // from ascii table
        //int x = 'A' ;


      //  System.out.println(x);
        char myChar = 'A';

        System.out.println(myChar);
        //'A' + 1 -->> 65 + 1 = 66-->> 66 REPRESENT-->'B' (myChar data type is char)
        System.out.println( ++myChar);
        //'B' + 1 -->> 66 + 1 = 67-->> 67 REPRESENT-->'C' (myChar data type is char)
        System.out.println( ++myChar);
        //'C' + 1 -->> 67 + 1 = 68-->> 68 REPRESENT-->'D' (myChar data type is char)
        System.out.println( ++myChar);
        //'D' + 1 -->> 68 + 1 = 69-->> 69 REPRESENT-->'E' (myChar data type is char)
        System.out.println( ++myChar);

        System.out.println( 'A' > 'B');// 65 > 66 FALSE
        System.out.println( 'Z' > 'B');  // TRUE
        for( char iChar = 'A' ; iChar<='Z' ; iChar ++){

            System.out.print(iChar + " ");

        }

        System.out.println();

        for( char kChar = 'Z' ; kChar >= 'A' ; kChar--){

            System.out.print(kChar + " ");

        }

         // HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        //IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER Z A, or A K
        // Can we ask user character ? NO!!!
        //Ask user for String and pick character by charAt()

        //below are my own repeated practice class content not the homework
 //       int x ='A' ;
//        char mChar = 101 ;
//        System.out.println(mChar);
//        System.out.println(++mChar);

 //       for( mChar = 'A' ; mChar <= 'Z' ; mChar ++){
//            System.out.println(mChar + " ");

        }
    }
