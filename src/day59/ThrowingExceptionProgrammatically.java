package day59;

public class ThrowingExceptionProgrammatically {

    public static void main(String[] args) {

//        NullPointerException e1 = new NullPointerException();

        NullPointerException e2 = new NullPointerException("Back to earth");
        System.out.println( e2.getMessage() );

        // How do I programmatically throw exception myself
        //we use throw keyword followed by exception object (or the variable that point to the exception object)
        // --- this is interview question
        throw e2 ; // throw is a keyword that has one purpose of throwing the exception to the runtime

       // System.out.println("END"); YOU CAN NOT WRITE ANY CODE BELOW THROW KEYWORD ,BECAUSE ENTIRE CODE STOP AT THROW e2;
        // below throw e2 ; are unreachable codes

        // the difference between throwing and printing

      //  throw new NullPointerException("Back to earth"); // this is also works

        //throw and throws means completely different thing , please DO NOT mix it up
        // top interview question always get asked : stay tuned

        // throw keyword can be used to programmatically throw the exception to the runtime to control the program flow



    }
}
