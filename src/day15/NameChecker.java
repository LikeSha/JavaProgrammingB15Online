package day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        // TASK 1 :

        // Name Checker
        //Declare a variable to store your name
        // check whether your name length is less than 4
          // if so print short name
          // if it is within 4-11  print medium name
          // if it's more than 11 , print longer name
        //--------------------------------------------------

        // check whether your name has either character a or e
        // if so -->> name with a or e
         // if not -->> I don't have both a and e in my name

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name please ");
        String name = scan.next();
        int lenthOfTheName = name.length();
        System.out.println("length Of The Name :" + lenthOfTheName);

        if(lenthOfTheName < 4){
            System.out.println("Short Name");
            //}else if( lenthOfTheName >= 4 &&lenthOfTheName <= 11 ){
            // lenthOfTheName >=4
        }else if(lenthOfTheName >= 4 && lenthOfTheName <= 11){
            System.out.println("Medium Name");
        }else{
            System.out.println("Longer Name");
        }
         //----------------------------------------------
        if(name.contains("a") || name.contains("e")){
            System.out.println("name with a or e");
        }else{
            System.out.println("I don't have both a and e in my name");
        }

    }
}
