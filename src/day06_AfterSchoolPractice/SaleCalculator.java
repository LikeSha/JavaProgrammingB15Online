package day06_AfterSchoolPractice;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {

        /*
        * Day 6

        WAKE UP TASK :

         Create a program to calculate the final discounted price of an item
         Create 3 variables calle regularPrice ,salePrice and discountPercentage
         Ask user question using scanner for regularPrice and discountPercentage
         And save the result into th variable
         Calculate sale price using above information
         For example : 80 regular price, 0.2 for discount , salePrice -->>64
         Print out : regular price is $80 , discount is  0.20 and your got deal for $64

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("How much is regular price ?");
        double regularPrice = scan.nextDouble();
        System.out.println("You said the regular price is " + regularPrice);

        System.out.println("How much is discount ?");
        double discountPercentage = scan.nextDouble();
        double salePrice = regularPrice - regularPrice * discountPercentage;
        System.out.println("You said the discount is " + discountPercentage);

        System.out.println(" So the regular price is " + "$" + regularPrice + ","+ " the discount is  " + discountPercentage
        + "," + " and you got deal for " + "$" + salePrice );

        // if you have variables with same data type , you can declare them in one line like this :
        //double regularPrice, discountPercentage , salePrice ;








    }

}
