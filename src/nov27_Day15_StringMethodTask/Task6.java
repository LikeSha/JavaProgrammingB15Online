package nov27_Day15_StringMethodTask;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        // TASK 6
        //Ask user to enter full name
        //assuming full name is 2 word
        //Write a program generate email account as below:
        //it starts with first character of first name
        //and whole last name then @NightWatch.com
        //for example;
        //Jon Snow--->>JSnow@NightWatch.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter full name");

        String fullName = scan.nextLine();

        System.out.println("Your full name is :" +fullName);

       char firstCha = fullName.charAt(0);
       int lastNameStartPoint = fullName.indexOf(" ") + 1 ;
       String WholeLastName = fullName.substring(lastNameStartPoint);

        System.out.println("Your email is :" + firstCha + WholeLastName + "@NightWatch.com");









    }
}
