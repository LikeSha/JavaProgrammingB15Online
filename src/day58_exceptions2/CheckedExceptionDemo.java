package day58_exceptions2;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("Checked Exception in next line");

            Thread.sleep(5000);// these line throws a CHECKED EXCEPTION--INTERRUPTEDEXCEPTION
        // CHECKED EXCEPTIONS MUST BE HANDLED OR DECLARED FOR THE CODE
        // TO COMPILE
        // INTERRUPPEDEXCEPTION IS A CHECKED EXCEPTION

        System.out.println("After Thread.sleep");



         /**
         * Throwable is also checked exception type
         * IOException :  IOException used in Java means Input Output Exception which in short means that the input
         * of your code does not seem to be aligning with the output It is indeed a type of error handling
         * which tells the compiler of your code that the program contains material that might throw ...
         *
         * Some lines of code in java , might cause one of checkedException during runtime . Java knows about those
         * statements. PROGRAMMER MUST HANDLE CHECKED EXCEPTIONS FOR THE PROGRAM TO COMPILE
         *
         * EXCEPTION-->
         *     InterruptedException--
         *     FileNotFoundException
         *     IOException                           THESE ARE CHECKED EXCEPTIONS
         *     URLException
         *     SQLException
         *
         *     interview point : what is checked exception ?
         *     answer :Checked Exceptions must be handled or declared by the programmer for the code to compile .
         *      otherwise code will not compile
         *
         *      Thread.sleep(1000); // pause for 1 second and continue to next line ( 1000 miliseconds = 1 second)
         *      WE USE THIS METHOD WHEN WE DO AUTOMATION ,LET THE CODING WAIT A LITTLE BIT ,THEN CONTINUE
          *
          *      When we write a line that might throw a checked exception ,programmer must handle or declare that line
          *      for the code to compile .
          *
          *      CHECKED EXCEPTIONS :
          *      1) handled using try catch block
          *      2) declare using throws keyword in method definition line
          *
          *      public static void main(String[] args){
          *         Thread.sleep(3000); <--will not compile because of Checked exception. it needs to be handled or declared
          *         }
          *
          *         ------------------------------
          *         Handling checked exception -> is done using try..catch block
          *
          *   1.      public static void main(String[] args){
          *         try{
          *         Thread.sleep(3000);
          *         }catch(Exception e){
          *         System.out.println( "Exception is caught");
          *
          *         }
          *     }
          *
          *     2.Declaring checked exception using throws keyword :
          *     public static void main(String[] args) throws Exception{
         *          Thread.sleep(3000);
          *    }
          *
          * If exception happens when code is running , catch block will catch the exception and print the message.
          * Then code will continue to run until end.
          *
         */


    }


}
