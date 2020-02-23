package day59;

public class ClassNote {

    /**
     * Exception :
     *
     *   scan.nextInt()--> expect number
     *   if we pass String -->exception at run time
     *
     *   String str = "a";
     *   str.charAt(0)--> exception at run time
     *
     *   String str2 = null
     *   str2.charAt(0) --> exception at run time
     *
     *   int[] arr = {1,2,4};
     *   print(arr[100]) -->exception at run time
     *
     *   print(9/0);--> exception at run time
     *
     *   Shape a1 = new Circle();  a1 is big cup  r1 is small cup
     *   Rectangle r1 = (Rectangle) a1;
     *   // above code compile but Throw classCaseException at run time
     *   //Because Circle is NOT-A Rectangle
     *
     *
     *
     *
     *   The process of dealing with the unexpected event is called Exception Handling
     *
     *   Just like everything else :
     *   Exception are object !!!!!
     *
     *   Exceptions in Java is categorized using Exception Hierarchy
     *     try to recover from it
     *     or report it
     *     diagnose it/debug
     *
     *     interview question : How do you handle exception ?
     *
     *          I use try catch block
     *
     *          try{
     *              // code that might throw an exception
     *
     *         }catch(Exception e){
     *
     *             // if the exception happen the flow of program will come here
     *             // take action to recover or just report or notify
     *         }
     *          // some code here
     *
     *
     *
     *
     *        or declare it
     *
     *
     *   All different types of exceptions have its own class to be the blueprint for the
     *   exceptions object happen at run time
     *
     *   Throwable
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *    ---WHAT ABOUT COMPILER ERROR ????   NO ---
     *     THIS IS SYNTAX ERROR THAT DOES NOT LET YOUR CODE COMPILE
     *
     *
     */
}
