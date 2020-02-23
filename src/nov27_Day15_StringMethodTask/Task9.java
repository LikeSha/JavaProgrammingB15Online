package nov27_Day15_StringMethodTask;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        //TASK 9
        //Ask user to enter valid URL in below format
        //www.blackfriday.com
        //Write a program to print first Index of.(dot)
        //and last index of .(dot)
        //and eventually print the domain
        //for example :
        //www.nightwatch.com--> blackfriday

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter valid URL");

        String validUrl = scan.next();

        int firstDot = validUrl.indexOf(".");
        System.out.println("First index of dot is " + firstDot);

        int lastDot = validUrl.lastIndexOf(".");
        System.out.println("Last index of dot is " + lastDot );

        String middleOfUrl = validUrl.substring(firstDot+1,lastDot);
        System.out.println("The middle part of your URL is " + middleOfUrl);


    }
}
