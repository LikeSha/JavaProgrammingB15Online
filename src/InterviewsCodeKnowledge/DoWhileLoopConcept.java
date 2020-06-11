package InterviewsCodeKnowledge;



import java.util.Scanner;

public class DoWhileLoopConcept {

    public static void main(String[] args) {

        // count from 1 to 10 ;

//        do{
        //           take some action here and repeat it
        //
        //       }while (some condition is true );

        int x = 1 ;

        do{
            System.out.println(x);
            ++x ;
        }while( x<=5);// semicolon ; is mandatory !! in do while program

        System.out.println("------------------------");
        // count from 5 to 1 :
        int y = 5 ;

        do{
            System.out.println( y );
            --y ;
        }while(y>0);

        // WHILE LOOP VS DO WHILE LOOP

        /* while loop check the condition first then enter the statement
         * do while loop will take the action at lease once then check the condition
         *
         * DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
         * WHILE LOOP MIGHT NOT EVEN RUN !!
         **/

        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK!!");
        System.out.println("WHAT IS THE PASSWORD ? ");
        String password;

        do{
            System.out.println("What's the password ? ");
            password = scan.next();
        }while( ! password.equals("B15"));

        System.out.println("Door is open!");
    }

    }

