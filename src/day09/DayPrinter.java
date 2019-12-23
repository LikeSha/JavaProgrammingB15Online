package day09;

import jdk.swing.interop.SwingInterOpUtils;

public class DayPrinter {

    public static void main(String[] args) {


        /*
        Create a variable called dayCode as int
        * if the dayCode is 1---Monday
        * if the dayCode is 2---Tuesday
          if the dayCode is 2---Wensday
          if the dayCode is 2---Thursday
          if the dayCode is 2---Friday
          if the dayCode is 2---Saturday
          if the dayCode is 2---Sunday
          if none of the above just print unknown day
         */

        int dayCode = 5 ;

        if(dayCode == 1){
            System.out.println("Day is Monday");
        }else if(dayCode==2){
            System.out.println("Day is Tuesday");
        }else if(dayCode==3){
            System.out.println("Day is Wednesday");
        }else if(dayCode==4){
            System.out.println("Day is Thursday");
        }else if(dayCode==5){
            System.out.println("Day is Friday");
        }else if(dayCode==6){
            System.out.println("Day is Saturday");
        }else if(dayCode==7){
            System.out.println("Day is Sunday");
        }else{
            System.out.println("Day is Unknown");
        }




    }




}
