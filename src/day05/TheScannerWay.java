package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

        // Scanner is class that comes from JDK library ,We can use it to capture keyboard input
        // from users

        //In order to use Scanner we need to first import it as below
        // Import java.util.Scanner;
        // The import statement must be in between your package declaration and before the
        //beginning of the class


        // ask user for name
        // and capture the result
        // print your name is this
        // ask user for birth year
        //and capture the result
        // print the age !!
        // ask user for height
        // and capture the result
        // print the height !!


        // Create scanner object
        // you can name your variable whatever you want
        // in below case we are calling it scan
        // Scanner is data type, scan is the name, new Scanner(System.in) is the value

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name :");
        //String name = "Sam";
        String name = scan.next();
        System.out.println(" Your name is " + name);

        System.out.println( "What is your birth year :");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear ;

        System.out.println("Your age is : " + age);

        System.out.println("What is your height ? ");
        double height = scan.nextDouble();
        System.out.println("your height is : " + height);

        /*
        There is few ways to get users input and store the result

        Getting single word as String -->scan.next();
        Getting single number as int-->scan.nextInt();
        Getting single fractional number as double -->scan.nextDouble();
        Getting single fractional number as float --> scan.nextFloat();
        Getting single true or false as boolean --> scan.nextBoolean();
         */







    }
}
