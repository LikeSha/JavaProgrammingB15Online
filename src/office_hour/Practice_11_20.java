package office_hour;

import java.util.Scanner;

public class Practice_11_20 {
    // Scanner nextX and nextLine method mixture problem
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age ?");
        int age = scan.nextInt();

        scan.nextLine();// this is just to capture the enter keyboard press
        // if you need to make this program run without an issue, enter age and name on same line .
        System.out.println("What is your full name ?");
        String fullName = scan.nextLine();

        System.out.println("Your name is "+ fullName + " , Your age is " + age);

         // ---What do you usually do before class to get ready for class
        //1,find out what topic will be taught -->> Cnacas Calendar
        //2, review and practice previous topic
        //3, repl practice
        //4,prepare questions that I have in mind for class or office hour
        //5,WATCH the short on upcoming topic
        //6,read the book to get general idea(try out few things if time allow)
        //7,join office hour review if time allow
        //8,read code note , stay up to date with slack announcements
        //9,help others with what you know






    }


}
