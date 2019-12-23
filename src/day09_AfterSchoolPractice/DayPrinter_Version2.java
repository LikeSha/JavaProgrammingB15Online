package day09_AfterSchoolPractice;

public class DayPrinter_Version2 {

    public static void main(String[] args) {

        int dayCode = 4 ;

        String dayName = "";

        if(dayCode == 1){
            dayName = "Monday ";
        }else if(dayCode == 2){
            dayName = "Tuesday";
        }else if(dayCode == 3){
            dayName = "Wednesday";
        }else if(dayCode == 4){
            dayName = "Thursday";
        }else if(dayCode == 5){
            dayName = "Friday";
        }else if(dayCode == 6){
            dayName = "Saturday";
        }else if(dayCode == 7){
            dayName = "Sunday";
        }else{
            dayName = " UNKNOWN!!!";
        }
        System.out.println("The day is " + dayName);






    }
}
