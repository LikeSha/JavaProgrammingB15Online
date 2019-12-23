package day11_AfterSchoolPractice;

public class WakeUp1_LightOnOff {

    public static void main(String[] args) {


        //Create a variable : targetOption as String and assign one of below options
        // for example bd

            String targetOption = "Bd";

        // You have 4 switches in your home to turn on
        //Bd--bedroom
        //Lr--living room
        //Ki--kitchen
        //Ha--Hallway

        // Use switch statement to write a program to print which room light is turned on
        // For example if Bd was targetOption
        //then print you have turned on bedroom light
        switch(targetOption){
            case "Bd":
            System.out.println("you have turned on bedroom light");
            break;
            case "Lr" :
                System.out.println("you have turned on living room light");
                break ;
            case "Ki" :
                System.out.println("you have turned on kitchen light");
                break ;
            case " Ha" :
                System.out.println("you have turned on hallway light");
            default:
                System.out.println("WRONG OPTION");






        }






        //  there is a targetOption tha store my option
        // and it looks like it has 2 character so I use String as data type





    }





}
