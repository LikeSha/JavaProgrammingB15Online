package day09_AfterSchoolPractice;

public class LanguagePicker_SwithStatment {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek call Center ");
        System.out.println(" Please select your language option from 1-7");


        int languageOption = 8 ;
        String greetings = "";

        switch(languageOption){
            case 1 :
                greetings = "Salam";
                break;
            case 2 :
                greetings = "Hello";
                break;
            case 3 :
                greetings = "Privet";
                break;
            case 4 :
                greetings = "Szia";
                break;
            case 5 :
                greetings = "Hola";
                break;
            case 6 :
                greetings = "Bonjour";
                break;
            case 7 :
                greetings = "UNKNOWN!!!";
                break;
            default:
                System.out.println(" Language is UNKNOWN!!!");

        }

        System.out.println("This is how the greeting message you get " + greetings);
    }





}
