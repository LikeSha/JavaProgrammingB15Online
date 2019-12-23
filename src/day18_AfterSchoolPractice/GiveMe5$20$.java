package day18_AfterSchoolPractice;

import java.util.Scanner;

public class GiveMe5$20$ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me $5 or $20 ");

        int money = scan.nextInt();

        while(!(money==5 || money==20)){
            System.out.println("NOT THE BILL I am lookingfor ");
            System.out.println("Give me 5 or 20");
            money= scan.nextInt();
        }
        System.out.println("THE HAPPY ENDING ");
    }
}
