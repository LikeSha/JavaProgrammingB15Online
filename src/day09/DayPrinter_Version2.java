package day09;

public class DayPrinter_Version2 {

    public static void main(String[] args) {


        /*
        Create a variable called dayCode as int
        * if the dayCode is 1---Monday
        * if the dayCode is 2---Tuesday
          if the dayCode is 2---Wednesday
          if the dayCode is 2---Thursday
          if the dayCode is 2---Friday
          if the dayCode is 2---Saturday
          if the dayCode is 2---Sunday
          if none of the above just print unknown day
         */

        int dayCode = 6 ;
        String dayName = ""; // assigning an empty String value


        if(dayCode == 1){
            dayName = "Monday";
        }else if(dayCode==2){
            dayName = "Tuesday";
        }else if(dayCode==3){
            dayName = "Wednesday";
        }else if(dayCode==4){
            dayName = "Thursday";
        }else if(dayCode==5){
            dayName = "Friday";
        }else if(dayCode==6){
            dayName = "Saturday";
            System.out.println("Have a good rest !");
        }else if(dayCode==7){
            dayName = "Sunday";
        }else{
            dayName = "UNKNOWN !!!";
        }


        System.out.println("Day is " + dayName);

    }





}
