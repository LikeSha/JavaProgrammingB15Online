package RtplSelfPractce;

import java.util.Scanner;

public class Rpl25_greaterNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        //WRITE YOUR CODE HERE:
        System.out.println("Enter number a here ");
        int a = s.nextInt();
        System.out.println("Enter number b here ");
        int b = s.nextInt();
        if (a>b) {
            System.out.println(a + " is greater");
        }else if(b>a){
            System.out.println(b + "  is greater");
        }


        }
    }

