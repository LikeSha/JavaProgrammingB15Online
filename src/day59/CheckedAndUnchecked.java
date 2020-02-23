package day59;

import java.io.IOException;

public class CheckedAndUnchecked {

    public static void main(String[] args) {

        String x = "abc";
  //      System.out.println(x.charAt(100));

        // Exception Hiearachy

//      Throwable --> child class --> Exception
        // Under Exception class,
        // there is one sub class known as RunTimeException
        //Anything IS-A RunTimeException regarded as UncheckedException
        //UncheckedException are not required to be handled at compile time

        // How do we know the exception is UncheckedException :
        // 1.check whether it's a RunTimeException or sub class of RunTimeException
        // 2.try to throw the exception programmatically , if it compile , it means its RunTimeException
//        throw new RuntimeException("just throwing it out");


        //what is checked exception ?\
        // an exception type that must be handled at compile time
        // everything that sub class of Exception but not RunTimeException
        // What we will do ? \
        // programmers are required to handle ( or declare) this type of exception

        // is the class Exception a type of checked exception or unchecked ?
        try {
            throw new IOException("just throwing this away");
        } catch (IOException e) {
            System.out.println("Exception caught");
        }


    }
}
