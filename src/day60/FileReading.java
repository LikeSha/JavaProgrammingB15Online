package day60;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {

    // First create a file by right clicking day60 package and select new --File
    // name your file as note.txt
    //enter few line or text
    // close the file (it might ask you to save , if it did not it means it already saved )
    // then use
    // List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt")); // or just copy paste
    //the method declare to throw checked exception so HANDLE OR DECLARE
    //for reading the file and storing it into the list
    // make sure the path is correct , if not , it will throw exception
    //print out the list content using loop to see whats inside line by line


    public static void main(String[] args) throws IOException {

        // reading a file is one line of code as below
        // it return List of String as each line as element
        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));
            System.out.println("allLines = " + allLines);

            for (String eachLine : allLines) {
                System.out.println(eachLine);
            }
        } catch (Exception e) {
            System.out.println("BOOM!!");
            System.out.println(e.getMessage());
        }

       // INTERVIEW QUESTION : HOW TO CREATE CUSTOM EXCEPTION ???
        // How do you create your own unchecked exception type :

         //  BreakTimeException , BrainOutOfMemoryException
        /*
        what is unchecked exception --> Anything IS-A RunTimeException
        so ALL NEED IS TO CREATE A SUBCLASS OF RunTimeException WITH YOUR OWN NAME

        public class BreakTimeException extends RunTimeException(or any sub class of it){

        }

        How do you create your own checked exception type :

        ALL YOU NEED IS TO CREATE A SUBCLASS OF ANY CHECKED EXCEPTION WITH YOUR OWN NAME

        public class HittingHeadToWallException extends Exception( or any sub class of it){

        }

        This is how we can create our own checked exception
        public class MyOwnCheckedException extends Exception

        This is how we can create our own unchecked exception
        public class BreakTimeException extends RuntimeException

         */


    }
}