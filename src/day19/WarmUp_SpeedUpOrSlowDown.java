package day19;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown {

    public static void main(String[] args) {

        // lets write sudo code for if start > end situation
        // and if start < end situation

        // IF START IS LESS THAN END , THE SPEED SUPPOSED TO BE INCREASED
        // for example : 10,11,12....45
        //IF START IS MORE THAN END , THE SPEED SUPPOSED TO BE DECREASED
        //45,44,43,42.....

        // for( int i = start ; i> end ; i--)

        // for loop only inside if statement can test both true and false
        // if you only do for loop but not inside if statement , when the condition
        // is false ,it wont go inside loop ,so if statement must include for loop logic
        // for loop entire format must inside the last " else" . right on the top of last "else"
        // there is a curly braces which is close entire for loop statement
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed ");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if(start<end){
            System.out.println("INCREASING THE SPEED");
            // i will increase the speed till i reach ending speed
            for(int i = start ; i <= end ; i++);
            System.out.print( start + ",");

        }else if( start > end ){
            System.out.println("DECREASING THE SPEED");
            // i will decrease the speed till i reach ending speed
            for( int x = start ; x >= end ; x--){
                System.out.print( x + " , ");
            }
        }else{

            System.out.println(" NO ACTION NEEDED !! SAME SPEED");

        }


    }
}
