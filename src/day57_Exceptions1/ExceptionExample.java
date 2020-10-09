package day57_Exceptions1;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15 online Friends");
//      int num = 2.5; COMPILE ERROR
        int[] nums = new int[3];// 0,1,2
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
       // nums[3] = 200;  // ArrayIndexOutOfBoundsException is thrown here.//Run time Error here //

        //System.out.println("Bye Bye B15 Online Friends");//This line does not run
        int result = 10/0;
        System.out.println("result is " + result);

        // this is called STACK TRACE ->Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	                            at day57_Exceptions1.ExceptionExample.main(ExceptionExample.java:16)

        // ArrayIndexOutOfBoundsException, ArithmeticException are classes in Java , and when we had matching issues in our code
        // during runtime, object is created from those classes and thrown, it caused the program to stop

        //ArrayIndexOutOfBoundsException--> is thrown when our code tries to access invalid index.
        // object from this class is crated and thrown
        // ArithmeticException -> is thrown during runtime when our code divides by zero

        //Since we know now , that exceptions are also objects from classes , we can look at their hierarchy.
        //In Java , exception classes use Inheritance . There are many classes for exceptions in Java , we just need to learn few

        // There are different main types of exceptions.

        // Throwable ---is Parent of all exception classes in java
        //Throwable has 2 main direct subclasses:
           // -->Error
           // --> Exception
             // --->RuntimeException
        //---------------------------------------------------------------------

        //Throwable has 2 main direct subclasses:
        // -->Error:
           //   --> OutOfMemoryError
           // --->  StackOverFlow
        // --> Exception
        //          --> RuntimeException
        // --->RuntimeException



        // Error vs Exception difference :
           // Error --> impossible to recover
           //         --> Happen during runtime
           //           --> normally caused by environment where application is running
         //   Exceptions :
         //           --> possible to recover from them ( we can HANDLE them)
        //            --> Caused by programmer's code


        //Throwable has 2 types:
        //      -->Checked exceptions:
        //           are exceptions that programmer MUST handle, otherwise code will not compile
        //           Exceptions that is checked by compiler during compile time
        //
        //      -->Unchecked Exceptions:
        //         These exceptions happen during runtime and and it is optional for a programmer to handle them
         //        Code will still compile even if programmer does not handle
        //         These are also called RunTimeExceptions

        // Checked exceptions : are Throwable , Exception and all of its subclasses , except RuntimeException

        // UncheckedExceptions : are RuntimeException class and all of its subclasses

        // How to handle exceptions in Java ?
        // try catch statement
    }
}
