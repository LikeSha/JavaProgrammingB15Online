package Nov27_Day15_StringMethodTask;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        // TASK 3
        // Ask user to enter full name
        //assuming full name is 2 word
        //Write a program to print users initials
        //for example :
        // Jon Snow--->>Initial is JS

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name");

        String fullName = scan.nextLine();

        int LastNamestartingPoint = fullName.indexOf(" ") + 1 ;
        int LastNameEndPoint = fullName.indexOf(" ") + 2 ;

        System.out.println("The user's initial is "+fullName.charAt(0)  +
                fullName.substring (LastNamestartingPoint,LastNameEndPoint ));





    }





}
