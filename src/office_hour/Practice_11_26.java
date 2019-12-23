package office_hour;

import java.util.Scanner;

public class Practice_11_26 {

    public static void main(String[] args) {

        // Nested --->> one thing inside another thing
        // pseudo code :
           // you have option to buy food and drink
        // under food you can buy meal or snack
        // under the drink you can buy soda or juice

        //If you selection is food
         // what kind do you want ? meal or snack

        //if you selection is drink
          // what kind do you want ? soda or juice

        Scanner scan = new Scanner(System.in);
        System.out.println("You want food or not ?");

       String mainOption = scan.next();                               //"food";


       if(mainOption.equalsIgnoreCase("Food")){

           System.out.println("You have selected food");

           System.out.println("You want meal or snack ?");             // "Snack";
           String secondaryOption = scan.next();

           if(secondaryOption.equalsIgnoreCase("snack")){

               System.out.println("You have selected snack");
           }else if(secondaryOption.equalsIgnoreCase("meal")){

               System.out.println("You have selected meal");
           }else{

               System.out.println("No such food option");
           }
       }








    }

}
