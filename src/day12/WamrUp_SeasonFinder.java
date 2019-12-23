package day12;

public class WamrUp_SeasonFinder {
     // <= and =< , are the y same thing
    public static void main(String[] args) {



        // Wake up Task 2

        /* Create a class called WarmUp_ SeasonFinder :

        Create a variable called month with data type int
        And write an if else if else statement to do following

        if the month is less than 1 or more than 12-->> INVALID MONTH
        if the month is between 3-5 print it's spring
        if the month is between 6-8 print it's Summer
        if the month is between 9-11 print it's fall
        if the month is 12,1,2 print it's Winter !

         */

        int month = 8 ;

        if(month > 12 || month < 1){
            System.out.println("INVALID MONTH !");
        }else if(month >= 3 && month <= 5){
            System.out.println("Spring");
        }else if(month >= 6 && month <= 8){
            System.out.println("Summer");
        }else if(month > 8 && month < 12){
            System.out.println("Fall");
        }else if(month == 12 || month == 1 || month == 2 ){
            System.out.println("Winter");
        }

         // Since first condition is already taking out invalid situation , we do not need
        // else in this case (the bottom of the entire program)
        // else is general option

    }

}
