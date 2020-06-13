package office_hour;

public class Practice_12_05Muhtar {

    public static void main(String[] args) {



        /*
           Review Topic : Loop Practice
                          While & do-while loops

           Loops : repeated action. repeats the steps in loops body for multiple times
                   For loop, While loop, do-while loop

           while loop :
                      while ( Condition){
                      statements;
                      }

                   while loop gets executed as long as the condition is true.
                   only stops executing when the condition becomes false
                   while loop is considered as a repeated if statement.

                   ANY FOR LOOP CAN BE CONVERTED TO WHILE LOOP


                      if(condition){
                         statements;
                      }

         */



        // if statement
        int a = 9 ;
        while( a > 0 ){  // false condition : a <= 0
            // if a is 9 ,8,7,....1
            System.out.println("Hello Batch 15");
            a-- ;
        }

         /* for loop : repeated action
            for ( initialization ; condition; iterator){ // iterator is NOT MANDATORY
                  mandatory        mandatory             // HOWEVER IF YOU DON'T GIVE
                                                         //ITERATOR, WILL BE LOGICAL ERROR

                  statements ;
            }

            initialization : starting point
                            int a = 0 ;
                            double b = 0 ;
                            ......

           condition needs to be created based on the initialization .ending point

           iterator : MUST be capable enough to make the condition false by increasing / decreasing
           the value of the initialization. Otherwise loop gets executed for infinite time

           other: first -->initialization
                  second--> condition
                  if condition is true:
                     third: body of the loop
                     fourth : iterator








          */

         // Any for loop can be converted to while loop
        System.out.println("--------for loop-----------------------");

        for (int i = 1; i < 9 ;i++) {

            System.out.println("Hello Batch 15");
        }


        System.out.println("--------for loop -----------------------");

        // TASK : 10-20
        for (int i = 10; i <= 20 ;) {
            System.out.println(i);
            i++ ; // iterator only can be given either inside parenthesis or the bottom of
                 // the body  , can not place right under the line " for (int i = 10; i <= 20 ;)!!
                 //for (int i = 10; i <= 20 ;)
                // System.out.println(i);
                // i ++ ----->> good
        }

        System.out.println("------------while loop------------------------------");
        // while loop :
        int j = 10 ;                              //int j = 10 ;
        while( j <= 20){                         // while( j <= 20){
            System.out.println(j);               // j++ ;
            j ++ ;                               //  System.out.println(j);
            // iterator must be placed under the print .
        }

            // do while loop :
            /* do{
                   statements ;
                 } while(condition);

                 order : first--> do block
                         second-->condition
                         if condition is true:
                            repeated

                do while at least gets executed for one time ,even if the condition is false


             */
        System.out.println("------do while loop---------------------");

        do{
            System.out.println("HELLO BATCH 15");
        }while(9 > 10);

        System.out.println("-----do while loop print out 10--20 -----------");

        int z = 10 ;
        do{
            System.out.println(z);// if you put z++ on the line 130 ,it will printed from 11 not 10
             z++;                // so you must put z++ ; under line 131 to meet requirement

        }while(z <= 20);

        // TASK :
        // 1, write a program using while loop, that calculates the sum of the even numbers
        // between 0-20

        // 2, write a program that can reverse a String
        // 3, write a program that can remove duplicates from a String
        //      "aaabbccc"-->>abc



    }

    }



