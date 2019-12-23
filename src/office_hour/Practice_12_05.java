package office_hour;

public class Practice_12_05 {

    public static void main(String[] args) {

        // if statement
        int a = 9 ;
        while( a > 0 ){  // false condition : a <= 0
            // if a is 9 ,8,7,....1
            System.out.println("Hello Batch 15");
            a-- ;
        }
         /* for loop : repeated action
            for ( initialization ; condition; iterator){
                  mandatory        mandatory

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


        System.out.println("-------------------------------");

        // TASK : 10-20
        for (int i = 10; i <= 20 ;) {
            System.out.println(i);
            i++ ; // iterator only can be given either inside parenthesis or the bottome of
                 // the body  , can not place right under the line " for (int i = 10; i <= 20 ;)!!
                 //for (int i = 10; i <= 20 ;)
                // System.out.println(i);
                // i ++ ----->> good




        }

        // while loop :
        int j = 10 ;                              //int j = 10 ;
        while( j <= 20){                         // while( j <= 20){
            System.out.println(j);               // j++ ;
            j ++ ;                               //  System.out.println(j);


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

            System.out.println(z);// if you put z++ on the line 103 ,it will printed from 11 not 10
            ; z++;                    // so you must put z++ ; under line 104 to meet requirement

        }while(z <= 20);

        // TASK :
        // 1, write a program using while loop, that calculates the sum of the even numbers
        // between 0-20

        // 2, write a program that can reverse a String
        // 3, write a program that can remove duplicates from a String
        //      "aaabbccc"-->>abc



    }

    }



