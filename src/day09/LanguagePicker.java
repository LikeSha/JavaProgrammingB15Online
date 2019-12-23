package day09;

import org.w3c.dom.ls.LSOutput;

public class LanguagePicker {

    public static void main(String[] args) {

        // TASK 3

        // language Picker
        // assume you are on the call and you have been given option to be greeted by the language of your choice according
        //to the number you provided

        // Create a variable called languageOption, String variable called greeting

        // 1-->"Hello"
        //2--> "Salam"
        //3__> "Hola"
        //4--> "Privet"
        //5--> "Merhaba"
        //6-->> "Szia"
        //7--> " Bonjour"

        // The program should set the value of a String variable called greeting To this value. : 1-->"Hello, SDET"

        // Print out -->> This is how the greeting message you get :" Hello, SDET"

        String greeting = "";
        int languageCode = 5;

        if (languageCode == 1) {
            greeting = "Salam";
        } else if (languageCode == 2) {
            greeting = "Hello";
        } else if (languageCode == 3) {
            greeting = "Hola";
        } else if (languageCode == 4) {
            greeting = "Privet";
        } else if (languageCode == 5) {
            greeting = "Merhaba";
        } else if (languageCode == 6) {
            greeting = "Szia";
        } else if (languageCode == 7) {
            greeting = " Bonjour";
        } else {
            greeting = "UNKNOWN !!";


        }
        System.out.println(greeting + " SDET");












        }
    }
