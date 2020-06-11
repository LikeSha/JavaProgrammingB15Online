package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        //{} curly braces
        //[] square bracket
        //() parenthesis
        // ; semi colon
        // : colon
        // % remainder operator
        // ! exclamation mark
        // | pipe
        // & ampersand
        // / forward slash
        // \  backslash
        // " double quote
        // ' single quote



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













    }
}
