package day09_AfterSchoolPractice;

import jdk.swing.interop.SwingInterOpUtils;

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

        int languageOption = 1 ;

        String greetings = "";

        if(languageOption == 1){
            greetings = "Salam";
        }else if(languageOption == 2){
            greetings = "Hello";
        }else if(languageOption == 3){
            greetings = "Hola";
        }else if(languageOption == 4){
            greetings = "Privet";
        }else if(languageOption == 5){
            greetings = "Merhaba";
        }else if(languageOption == 6){
            greetings = "Szia";
        }else if(languageOption == 7){
            greetings = "Bonjour";
        }else{
            greetings = "UNKNOWN !!!";
        }
        System.out.println( greetings + " SDET");











    }
}
