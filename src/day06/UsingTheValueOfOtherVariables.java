package day06;

import jdk.swing.interop.SwingInterOpUtils;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {


        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber ;


        System.out.println("My Favorite Number " + myFavoriteNumber );
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100 ;
        System.out.println("My Favorite Number " + myFavoriteNumber );
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        // Create a variable called yourOrder, type String and assign a value
        // optionally assign this value using Scanner
        // Create another variable called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out.

        String YourOrder = " Gucci Bag ";
        String myOrder = YourOrder ;
        System.out.println("Your Order is " + YourOrder );
        System.out.println("My order is " + myOrder );




    }
}
