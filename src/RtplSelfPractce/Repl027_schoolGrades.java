package RtplSelfPractce;

import java.util.Scanner;

public class Repl027_schoolGrades {

    public static void main(String[] args) {

        //Write the program that will calculate average grade.
        //Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
        String subject1, subject2, subject3, subject4, subject5, summary;
        //Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;
        double grade1, grade2, grade3, grade4, grade5, average;
        //-Create a Scanner object named scan.
        Scanner scan = new Scanner(System.in);

        //Execution flow with example:

        //-Display prompt :"Welcome to the Grader!"
        System.out.println("Welcome to the Grader!");
        //-Display prompt: "Please enter subject name number 1 and score for this subject"
        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1 = scan.next();
        grade1 = scan.nextDouble();

        //Math
        //5.0

        //-Display prompt: "Please enter subject name number 2 and score for this subject
        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2 = scan.next();
        grade2 = scan.nextDouble();
        //Biology
        //4.2

        //-Display prompt: "Please enter subject name number 3 and score for this subject"
        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3 = scan.next();
        grade3 = scan.nextDouble();
        //English
        //4.4

        //-Display prompt: "Please enter subject name number 4 and score for this subject"
        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4 = scan.next();
        grade4 = scan.nextDouble();

        //Chemistry
        //4.8

        //-Display prompt: "Please enter subject name number 5 and score for this subject"
        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5 = scan.next();
        grade5 = scan.nextDouble();
        //Music
        //3.4

        //-build summary variable by concatenating subject names and grades
        summary = (subject1 + ":" + " - " + grade1) + (subject2 + "," + " - " + grade2) + (subject3 + ":" + " - " + grade3) +
                (subject4 + ":" + " - " + grade4) + (subject5 + ":" + " - " + grade5);
        //calculate average score and define that value into average variable.
        double averageScore = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        //-Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
        System.out.println("Summary:" + (subject1 + ":" + " - " + grade1) + "," + " " + (subject2 + "," + " - " + grade2) + "," + " " + (subject3 + ":" + " - " + grade3) +
                "," + " " + (subject4 + ":" + " - " + grade4) + "," + " " + (subject5 + ":" + " - " + grade5));
        //-Display prompt: "Your average score is: 4.36"
        System.out.println("Your average score is:" + averageScore );
        //-Display prompt: "Thank you for using Grader!"
        System.out.println("Thank you for using Grader!");
        //-Display prompt: "Goodbye!"
        System.out.println("Goodbye!");


    }
}
