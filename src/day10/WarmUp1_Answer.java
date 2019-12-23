package day10;

public class WarmUp1_Answer {

    public static void main(String[] args) {

        // Warm up task 1

        // Create a class called answer with main
        // Create a variable called myAnswer as String withe value of empty String
        // Create a variable called myNumber and assign any value
        // If the number can be divided by 5 without remainder , Assign myAnswer value to Fizz Number
        // If not assign the value to not a Fizz Number

        // Outside if else statement :
        // Print my number is <>, It is <value of myAnswer here>

        String myAnswer = "";
        int myNumber = 6 ;

        if(myNumber%5==0){
            myAnswer = "Fizz Number";
        }else{
            myAnswer = "not a Fizz Number";
        }
        System.out.println("My number is " + myNumber + " , It is " + myAnswer);



    }




}
