package day31;

public class Voting {

    public static void main(String[] args) {

        checkEligibility(15);

        checkEligibility(23);

        checkEligibility(63);

        int yourAge = 12;
        checkEligibility(yourAge);

        // can not access the method parameter outside the method
        // therefore : if you do this its not working : System.out.println(age); the method checkEligibility()
        // can not see this variable "age"

    }

    // This method has one int parameter named age
    // whoever calling this method ,need to provide a number
    // it will set the value of age into that number
    // the method parameter can be only accessible within the method
    public static void checkEligibility(int age) { // "int age" in here is called " method parameter

        //int age = 15 ;

        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible");
        }

    }


}
