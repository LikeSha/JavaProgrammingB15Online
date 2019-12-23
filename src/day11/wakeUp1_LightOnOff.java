package day11;

public class wakeUp1_LightOnOff {

    public static void main(String[] args) {

        //Create a variable : targetOption as String and assign one of below options
          // for example bd

        // You have 4 switches in your home to turn on
        //Bd--bedroom
        //Lr--living room
        //Ki--kitchen
        //Ha--Hallway

        // Use switch statement to write a program to print which room light is turned on
        // For example if Bd was targetOption
          //then print you have turned on bedroom light


        //  there is a targetOption that store my option
        // and it looks like it has 2 characters so I use String as data type
        String targetOption = "Bd";
        // what can be the data type of the variable inside switch
        // byte ,short,int,char,String , Try yourself by using char after class
        switch(targetOption){

            case "Bd" :
                System.out.println("you have turned on bedroom light");
                break ;
            case "Lr" :
                System.out.println("you have turned on living room light");
                break ;
            case " Ki" :
                System.out.println("you have turned on kitchen light");
                break;
            case "Ha" :
                System.out.println("you have turned on hallway light");
                break;
            default:
                System.out.println("WRONG OPTION ");




        }




    }
}
