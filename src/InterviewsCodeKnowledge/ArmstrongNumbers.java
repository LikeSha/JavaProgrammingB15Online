package InterviewsCodeKnowledge;

import org.w3c.dom.ls.LSOutput;

public class ArmstrongNumbers {

    /*
    Write a method that can check if a number is Armstrong  number

    An Armstrong number of three digits is an integer such that the sum of the cubes
    of its digits is equal to the number itself.
    For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371--> 3^3 + 7^7 + 1^1
     */

    public static void main(String[] args) {

        System.out.println("ArmStrongNumber(371) = " + ArmStrongNumber(371));
    }

    public static boolean ArmStrongNumber(int num){

        int a = 0, b = 0, c=num;

        while(num>0){
            a = num%10;
            num/=10;
            b=b+(a*a*a);
        }

        if(c==b){
            return true;
        }

        return false;


    }


    public static boolean isArmstrong(int num){

        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            int digit = Integer.parseInt("" + number.charAt(i));
            sum+=Math.pow(digit,power);
        }
        return sum == num;
    }

    public static boolean isArmstrong2(int num){

        int digits = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        /// 153
        // num % 10 --> last digit  %10 returns last digit of a number

        while(digits !=0 ){

            int each = digits % 10;
            digits /= 10;

            sum += Math.pow(each,power);
        }
        return sum == num;
    }


}
