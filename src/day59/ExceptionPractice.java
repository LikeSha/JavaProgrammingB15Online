package day59;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {


        // This simple program will get certain character from Furkan's name
        // according to the index user provided
        System.out.println("The Start");
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name");
        int targetIndex = scan.nextInt();

        try {
            System.out.println(name.charAt(targetIndex));
         // }catch(Exception e){ // This is a general catch block that can catch any exception IS-A sub type of Exception class
            // below will narrow down the catch block to
            //only catch StringIndexOfOutOfBoundsException and take action accordingly
        }catch( StringIndexOutOfBoundsException e){
            //etMessage is a method coming from Exception class and provide some more details about exception object
            System.out.println("Message from getMessage method " + e.getMessage());
            System.out.println("Something unusual happen!!");
        }
        System.out.println("The End");

//        System.out.println("name = " + name);
//        System.out.println("The End");





                // Exceptions are object , so it has it's own class
//        // and we can create object ourselves jut like we did from any other classes
//        StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
//        System.out.println( e1.toString() );



    }
}
