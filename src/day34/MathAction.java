package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {

    // calling the static methods of other classes

    public static void main(String[] args) {

        // call your build3DigitNumbers method here
        // build3DigitNumbers is under day34 package
        // and inside PracticeMethodWithNumbers
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        // in order to use Arrays class that coming from java.util package (NOT YOUR PACKAGE)
        // first we need to import them import java.util.Arrays;
        // in order to call static method of Arrays class ,
        // we need to use classname.methodName(...);
        // here Arrays.toString(your array objects goes here)
        int[] nums = {2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        // How can I call static method calculate in Calculator_V2 under day 31 package
        // first thing first , it's not under current package34
        // so we need to import the class-->> import dy31.Calculator_V2
        //in order to call static method of Calculator_V2 class,
        // Calculator_V2.yourStaticMethodName(...)
        Calculator_V2.calculate('-',10,20);// highlight calculate and press ctrl + shift + i
        // to see inside the method

        // its a void method (Calculator_V2.calculate('-',10,20);) ,
        // so I don't have to save the result . Its void method , I just called them,
        // take action, and get done with it . lets run this ....


    }
}
