package day09_AfterSchoolPractice;

public class CitizenTypeChecker {

    public static void main(String[] args) {


        // Task 2
        // Create a class called CitizenTypeChecker with main method
        // Create a variable called citizenType as String
        // And create a variable with age
        // If the age is more than 65, assign value of citizenType to Senior

        String citizenType ;
        int age = 80 ;

        if(age>=65){
            citizenType = " senior";
        }else{
            citizenType = " Not senior";
        }


        System.out.println(" the citizen's age is " + age + " , and he is considered as" + citizenType);


    }





}
