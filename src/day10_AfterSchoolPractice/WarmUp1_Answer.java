package day10_AfterSchoolPractice;

import jdk.swing.interop.SwingInterOpUtils;

public class WarmUp1_Answer {

    public static void main(String[] args) {


        /**Create a class called Answer with main
         * Create a variable called myAnswer as String with value of empty
         * String
         * Create a variable called myNumber and assign any value
         * If the number can be divided by 5 without remainder
         * Assign myAnswer value to Fizz Number
         * if not assign the value to not a Fizz Number
         *
         * Outside if else statment :
         * print my number is <>, It is <value of myAnswer here>
         **/
          String myAnswer = "";
          int myNumber = 25 ;

          if(myNumber%5 == 0){
              myAnswer = " Fizz Number";
          }else{
              myAnswer = " not a Fizz Number";

        }
        System.out.println("My number is " + myNumber + ", and it is " + myAnswer);


    }




}
