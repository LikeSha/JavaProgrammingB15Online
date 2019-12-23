package day18;

import java.util.Scanner;

public class GiveMe5$20$ {

    public static void main(String[] args) {

        // Keep asking for $5 or $20 until you get them

        Scanner scan = new Scanner(System.in);
        System.out.println("give me 5 or 20!!");

        int x = scan.nextInt() ;
               // 5!=5 is false 5!=20 is true ,so can not use || logical error, so must be &&
        // if the bill is not 5 dollar and not 20 keep in the loop not get out
        //or negate the result of it's 5 or 20
         // if (x==5 || x==20) -->> happy ending ,otherwise anything else is not happy ending
        //we can change above (x==5 || x==20) -->> !(x==5 || x==20)
        //  while( !(x==5 || x==20) ){
        while( x!=5 && x!=20){
            System.out.println("NOT THE BILL I AM LOOKING FOR");
            System.out.println("GIVE ME 5 OR 20");
            x = scan.nextInt();
        }

        System.out.println("THE HAPPY ENDING!! GOT THE MONEY");




    }


}
