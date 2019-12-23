package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        // combining multiple condition target

        // in java there is no range check directly like math
        // for example   int x = 70 ;
        // in math : 60 < x <100 --> true < 100
        // in java :  x > 60 && x < 100

        // &&  2 ampersand ( double ampersand ) & 1 ampersand  --> Logical AND operator
        // This is used to check both conditions are true at the same time

        // Think about login example
        // only when your username is right and your password is right at the same tiem
        // then you will be able to login

        /*              true        true
        * int x = 70 ; x > 60 && x < 100 ;   true

        *               false       true
        * int x = 10 ; x > 60 && x < 100 ;   false

                         true       false
        * int x = 110 ; x > 60 && x < 100 ;  false

                         true       true
        * int x = 99 ; x > 60 && x < 100 ;   true

         **/
        System.out.println(" TRUTH TABLE && ");

//        System.out.println(  true && true );
//        System.out.println(  false && true );
//        System.out.println( true && false );
        //       System.out.println( false && false);


        System.out.println(" RESULT OF true && true is " + (true && true));
        System.out.println(" RESULT OF false && true is " + (false && true));
        System.out.println(" RESULT OF true && false is " + (true && false));
        System.out.println(" RESULT OF false && false is " + (false && false));

        // 2 pipe or | 1 pipe is used for compiling 2 conditions : Logical OR Operator
        /* If you have 2 conditions to check
        when will this be true: As long as one side is true , whole result will be true
        // think about buying milk from 2 stores :
        As long as you found the milk in one store , you got the milk then you get out !

        As long as one side is true, whole result will be true
         */

         /*
                         true     false
         int x = 70 ;  x > 10 || x < 5 .   --> true

                         false    false
         int x = 7 ;  x > 10 || x < 5 .   --> false

                        true      false
         int x = 17 ;  x > 10 || x < 5 .   --> true

                        false      true
         int x = -8 ;  x > 10 || x < 5 .   --> true


          */

        System.out.println(" TRUTH TABLE || ");

         System.out.println(" RESULT OF true || true is " + (true || true));
        System.out.println(" RESULT OF false || true is " + (false || true));
        System.out.println(" RESULT OF true || false is " + (true || false));
        System.out.println(" RESULT OF false || false is " + (false || false));


        // Create a variable called num with type int
        // find out whether this number is more than 100 or less than 10

        // find out the number is within the range of 10--60
        // and print out the result

        int num  = 55 ;
        System.out.println(    num>100 || num<10    );
        System.out.println(    num>10 && num<60     );

        // more than 2 conditions at the same time , 3 conditions

                                    //true|| false --> true
        System.out.println(    true || false  || false );
                                    // true && false--> false
        System.out.println(    true && false  && false );
                               // false || fasle->false || true-->true
        System.out.println(    num==50 ||    num ==51 ||    num==55     );

        // check num is more than 50 and num is not 52 or num equal to 57

        // == is checking for equality, != is checking for inequality

                              // true && true
                                         // true || false-->true
        System.out.println(   num>50 && num != 52 || num==57              );

        System.out.println( false || true && true  );










    }
}
