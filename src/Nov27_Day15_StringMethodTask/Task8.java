package Nov27_Day15_StringMethodTask;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        //TASK 8
        //Ask user to enter a sentence
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        //Assuming the sentence has at least 2 words
        //also assuming there is single space between words-->
        //first trim empty spaces in two sides
        sentence = sentence.trim();
        System.out.println("sentence is " + sentence.trim());
        //then check if the first index of space is equal to last index of the space
        int firstSpaceLocation = sentence.indexOf(" ");

        int lastSpaceLocation = sentence.lastIndexOf(" ");

        if(firstSpaceLocation == lastSpaceLocation){
            System.out.println("You have entered two words");
        }else{
            System.out.println("You have more than 2 words");
        }

        //if so print you have entered two words
        //else print you have more than 2 words
        //for example:
        //Jon Snow-->>
        //first index of the space is 3
        //last index of the space is also 3
        // this means there is only 2 words
        //King in the North-->>
        //first index of the space is 4
        //last index of the space is  11
        //this means there is more than 2 words






    }
}
