package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        // Task 2
        // Create a class called CitizenTypeChecker with main method
        // Create a variable called citizenType as String
        // And create a variable with age
        // If the age is more than 65, assign value of citizenType to Senior

        String citizenType ;

        int age = 66 ;

        if(age > 65) {
            citizenType = " Senior";
        }else {
            citizenType = " Not Senior";


            // what can you do inside each part of if statement inside curly braces--ANYTHING YOU CAN DO : ASSIGN A VALUE ,
            // PRINT ,ADD CONDITION .......
        }

        System.out.println("The citizen age is " + age + " ,and he is a " + citizenType);

    }





}
