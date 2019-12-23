package day07_AfterSchoolPractice;

public class EmailCreator {

    public static void main(String[] args) {

        // Create 3 String variable for first name last name ,company
        // Create another variable for email
        // Create email in this format firsName_lastName@company.com

        // print out the result as , my name is <your full name > and I work for <company>
        // and my email is <email>

        System.out.println("Enter your first name , last name , company separated by space :");
        String firstName = "Salik";
        String lastName = "Malik";
        String company = "Qcom";
        String email= firstName + lastName + "@" + company + " . com" ;

        System.out.println("My name is " + firstName + " " +lastName  +  " and I work for " +
                company + "." + " and my email is " + firstName + "_ " +  lastName + "@" + company + " . com");


    }
}
