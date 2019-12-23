package day10;

import jdk.swing.interop.SwingInterOpUtils;

public class MultiBranch_Practice {

    public static void main(String[] args) {


        // At the McDonald Drive thru
        System.out.println("Welcome to McDonald, what can I get for you ?");

        /*
        * 11, Burger
        * 5, French Fries
        * 8, Nuggets
        * 35, IceCream
        * 55, Coke
        **/

        String order = "";
        int itemNumber = 8 ;

        if(itemNumber == 11){
            System.out.println("You have selected 11");
            order = "Burger";
        }else if(itemNumber== 5){
            System.out.println("You have selected 5");
            order = "French Fries";
        }else if(itemNumber == 8){
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else if(itemNumber == 35){
            System.out.println("You have selected 35");
            System.out.println("YAY!!!YUM!!!");
            System.out.println("ENJOY!!!");
            order = "IceCream";
        }else{
            System.out.println("You have selected unknown item .");
            order = "unknown";
        }

        System.out.println("Your order is " + order);


    }





}
