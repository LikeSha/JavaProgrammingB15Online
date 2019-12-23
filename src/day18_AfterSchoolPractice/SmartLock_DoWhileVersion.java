package day18_AfterSchoolPractice;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");

        String password = scan.next();

        do{
            System.out.println("Please enter your password");
            password = scan.next();
        }while(!password.equals("B15"));

        System.out.println("DOOR IS OPEN!!!");

        }


    }

