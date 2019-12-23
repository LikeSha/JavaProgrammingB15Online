package day05_AfterSchoolPractice;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive data types
        /*
        Block comment , everything in between will be seen as comment

        whole numbers           : byte ,short , int , long
        fractional numbers      : float , double
        logical                 : boolean ( true, false)
        character               : char ( single character in single quote)

        usually by default for whole number : just use int
        usually by default for fractional numbers : just use double

        IS String part of Primitive types ?  : NOOO!!!!!
        String is sequence of character
        */

        // Task 1 : Age calculator
        // given birth year , please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear ;


        // I was born in year 2001 , and I am 18 years old ;
        //System.out.println( "I was born in year " + 2001 + " , and I am " + (2019-2001) + "years old");
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old") ;

        // Task 2 : you are speeding today
        // speed limit is some number , and your current speed is this
        // generate this output of : You are driving 10 mph more than speed limit
        // speedlimit as int , currentSpeed as int , overTheLimite as int
        int speedLimit = 65;
        int currentSpeed =75;

        int overTheLimit = currentSpeed - speedLimit  ;

        System.out.println( "My state speed limit is " + speedLimit + " mph," + " My current speed " +
                "is "+ currentSpeed + " mph . It means I am " + overTheLimit + " mph more than speed limit");




    }

}
