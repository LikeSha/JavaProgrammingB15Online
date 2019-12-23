package day06;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
public class SaleCalculator {

    public static void main(String[] args) {


         /*
        * Day 6

        WAKE UP TASK :

         Create a program to calculate the final discounted price of an item
         Create 3 variables called regularPrice ,salePrice and discountPercentage
         Ask user question using scanner for regularPrice and discountPercentage
         And save the result into th variable
         Calculate sale price using above information
         For example : 80 regular price, 0.2 for discount , salePrice -->>64
         Print out : regular price is $80 , discount is  0.20 and your got deal for $64

         */
        Scanner scan = new Scanner(System.in);

        double regularPrice ;
        double salePrice;
        double discount;



        System.out.println(" What is the regular price ? ");
        regularPrice = scan.nextDouble();

        System.out.println("What is discount rate ?");
        discount  = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount ;


        System.out.println("regular price is " + regularPrice +  "discount is " + discount +  "and you got deal for " + salePrice );



        // if you have variables with same data type, you can declare them in one line like this:
        // double regularPrice, salePrice, discountPercentage ;

        // this is teacher example :

        //double regularPrice;
        //double  salePrice;
        // double discount ;

        //system.out.println("what is the regulare price ?")
        // regularPrice = blabla.nextDouble();
        //System.out.printlin("What is discount rate ?")
        //discount = blabla.nextDouble()'
        //salePrice = regularPrice - regularPrice* discount

        //System.out.println("regular price is " + regularPrice + "$, discount is " + discount + "
        // and yor got deal for " + salePrice + "$")


    }



}
