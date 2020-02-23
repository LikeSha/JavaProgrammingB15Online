package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain{

    //Handle or Declare are the way to deal with checked exception
    // if you are sure the method will never actually throw the exception
    //it's good to just declare ti to go through compiler to make it happy
     // if there is actually a chance for the exception might left unhandled

    public static void main(String[] args) throws InterruptedException { //FileNotFoundException

        // calling a method that declare to throws checked exception
        System.out.println("THE START");
        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("HANDLING HERE !!! JUST MOVING ON !!");
        }
        //Thread class is coming from java.lang package
        //it has a method called sleep and it will let your program pause for x milliseconds
        Thread.sleep(3000);
        System.out.println("The end");

    }

     // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    //the exception type already exists for this type of situation is called
    //FileNotFoundException from java.util package
     public static void readMyFile() throws FileNotFoundException {

         System.out.println("Reading the file in my computer");
         throw new FileNotFoundException("Kaboom ! file is not here !!");

     }


}


