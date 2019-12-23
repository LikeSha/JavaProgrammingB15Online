package Nov27_Day15_StringMethodTask;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        // TASK 4
        //Ask user to enter a word with at least 3 characters
        //print the first character
        //print the last character
        //print the middle character
        //for example : Uighur
        //first character : U
        //last character : r
        //middle character :g
        //(if the length is even number get the one on the left)

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Please enter a word at least 3 character");
        String word = scan.next();

        String lastCharacter = word.substring(word.length()-1);

        char firstCharacter = word.charAt(0);

        System.out.println("first character is :" + firstCharacter );
        System.out.println("last character is :" + lastCharacter);

        int middleCharacter = word.length()/2-1;

        word.charAt(middleCharacter);

        if(word.equals("even number")){

            System.out.println("middle number is :"+ word.charAt(middleCharacter));

        }

        System.out.println("middle number is :"+ word.charAt(middleCharacter));

    }














    }

