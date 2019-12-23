package RtplSelfPractce;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Repl063_PrintFirstCharacter {

    public static void main(String[] args) {

        // Write a program that will print out first character of the word.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        System.out.println("The first character of " + word + " is "  + word.charAt(0));




    }
}
