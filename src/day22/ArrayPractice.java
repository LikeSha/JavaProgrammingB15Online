package day22;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayPractice {

    public static void main(String[] args) {

        double[] prices = new double[5] ;

        System.out.println(prices[0]);
        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

        prices[0] = 2.46 ;
        prices[1] = 12.96 ;
        prices[2] = 922.1 ;
        prices[3] = 500 ;
        prices[4] = 65.123 ;
        // what happen if I go over the range
        // RUN TIME ERROR !!!
       // prices[5] = 165.3 ; // when you print it out ,it will show " run time error

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // Create a char array that hold all the letter from your first name
        // and assign values using each characters of your first name

        // then print out each character

        char[] nameChars = new char[5] ;
        // What default value fo we get for har array
        // we get a char represented by ascii code 0
        System.out.println("<" + nameChars[0] + ">");
        nameChars[0] = 'S' ;
        nameChars[1] = 'A' ;
        nameChars[2] = 'L' ;
        nameChars[3] = 'I' ;
        nameChars[4] = 'K' ;

        System.out.println(nameChars[0]);
        System.out.println(nameChars[1]);
        System.out.println(nameChars[2]);
        System.out.println(nameChars[3]);
        System.out.println(nameChars[4]);
        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        System.out.println(nameChars);

        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true ;
        yesNo[1] = false ;
        yesNo[2] = true ;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);



    }


}
