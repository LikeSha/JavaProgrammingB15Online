package rtplSelfPractce;

import java.util.Scanner;

public class Repl060_TernaryOperator1 {

    public static void main(String[] args) {

        /**Write an expression using the conditional operator (? :)
         * that compares the value of the variable x to 5 and results in:
         Display x if x is greater than or equal to 5
         Display -x if x is less than 5

         DO NOT USE IF STATEMENT or SWITCH CASE

         watch this short for more info
         https://learn.cybertekschool.com/courses/278/pages/20-ternary-conditional-statement?module_item_id=14151


         */                                          // int num ;
        Scanner scan = new Scanner(System.in);      //  num = (x >= 5) ? x : -x ;

        System.out.println("Enter number:");
        int x = scan.nextInt();

        x = (x >= 5) ? x : -x ;






    }
}
