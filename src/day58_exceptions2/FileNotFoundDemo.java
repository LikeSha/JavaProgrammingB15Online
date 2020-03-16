package day58_exceptions2;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;         //
// above line is " import java .nio.*;

public class FileNotFoundDemo {

     public static void main(String[] args) throws Exception{
         System.out.println("Before Try catch");
         Files.readAllLines(Paths.get("file.txt"));
//         try {
//             Files.readAllLines(Paths.get("file.txt"));
//         }catch(IOException e){
//             System.out.println("Exception happened and caught!");
//         }
         System.out.println("After try catch");

         // Throws keyword in java ,is used to declare that a method ( or main method ) might throw exception.
         // it does not handle the exception.
         // For handling we need to use try catch block

         /**
          * benefit of throws :
          *   ---> helps our code to compile
          * disadvantage :
          *   --->if exception happens during runtime, code will stop and will not continue running
          *
          *   try catch block in java ---> is used handle an exception
          *
          *   try block --> we put code that we want to protect from exceptions
          *
          *   catch block --? is used to catch can exception if it happens due to some line in try block.
          *   if exception happens and gets caught , code in catch block will run .
          *
          *   benefit :
          *      code will continue running until end with stopping due to exception.
          *
          *      --------------------------------------------------------------------------
          *
          *
          */

     }

}
