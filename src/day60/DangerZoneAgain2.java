package day60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("THE START");

        readMyFile();

        Thread.sleep(3000);
        System.out.println("The end");

    }

    // FileNotFoundException extends IOException
    public static void readMyFile() {

        System.out.println("Reading the file in my computer ");

        try {
            // we are throwing a checked exception
            // so IT MUST BE HANDLED OR DECLARED , here we chose to handle it with try catch
            //throw new FileNotFoundException("Kaboom ! file is not here!!!")
            throw new FileNotFoundException("Kaboom! file is not here !!!");
        } catch (FileNotFoundException e) {
            System.out.println("AHA!! CAUGHT YOU IN readMyFile!!!!");
        }
         // Files is a class coming from import java.nio.file package;
        // it has lots of file related utility.
        //readAllLines static method is easiest way to rad a text file (including csv file)
        //it accepts a file path as argument and return all lines in a List of String
        //readAllLines method declares (document) to throw IOException
        //IOException is a checked exception-->must be handled or decleared

        // quick side bar : FileNotFoundExcepion is sub class of IOException


    }
}