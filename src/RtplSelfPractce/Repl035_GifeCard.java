package RtplSelfPractce;

import java.util.Scanner;

public class Repl035_GifeCard {

    public static void main(String[] args) {

        /**Let's say I've got a 100$ gift card and you want to buy something in your online store .
         * Write a program that will help me to buy something and display leftover balance after purchase.
         * If item is not in the list, display message: "Invalid item!".
         * If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
         Hint
         Use if/ else if / else
         CODE EXAMPLE:
         Example #1
         input: Hat
         output: Thank you for your purchase!
         output: Your current balance is: 75$

         Example #2
         input: Pants
         output: Thank you for your purchase!
         output: Your current balance is: 50$

         Example #3
         input: Laptop
         output: Sorry, not enough funds on your gift card!

         Example #4
         input: Cupcake
         output: Invalid item!

         */
        Scanner scan = new Scanner(System.in) ;

        System.out.println("It's Black Friday ! Enter the item you want to buy");

        int buddget = 100 ;
        int costOfItem = scan.nextInt() ;
        int leftOverBalance = buddget - costOfItem ;


        String shoppingItem = scan.next();

        if(shoppingItem.equalsIgnoreCase("Laptop") || shoppingItem.equalsIgnoreCase("Smartphone")){

            System.out.println("Sorry, not enough funds on your gift card!");

        }else if(shoppingItem.equalsIgnoreCase("pillow") || shoppingItem.equalsIgnoreCase("Blanket")  || shoppingItem.equalsIgnoreCase("Socks")
        || shoppingItem.equalsIgnoreCase("Hat") || shoppingItem.equalsIgnoreCase("Pants") || shoppingItem.equalsIgnoreCase("Headphones")
         || shoppingItem.equalsIgnoreCase("USB cable") || shoppingItem.equalsIgnoreCase("Charger")){

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + leftOverBalance);

        }else{

            System.out.println("Invalid item!");
        }









    }
}
      // System.out.println(" Your current balance is: " +leftOverBalance);