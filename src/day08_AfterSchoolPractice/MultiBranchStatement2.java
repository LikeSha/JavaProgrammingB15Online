package day08_AfterSchoolPractice;

public class MultiBranchStatement2 {

    public static void main(String[] args) {

        /*
        given your currentSpeed , speedLimit
        *
        * check whether the current speed is
        *   more than 90--->> jail
        *   more than 80 and less than 90 -->> reckless driving
        *   more than 70 -->> point taken
        *   more than 60 and less than 70 -->> warning
        *
        *
        */

          int currentSpeed = 60 ;
          if(currentSpeed > 90){
              System.out.println( " You are speeding over 90 mph , go to jail !");
          }else if( currentSpeed > 80){
              System.out.println(" you are speeding , reckless driving !");
          }else if( currentSpeed >70){
              System.out.println("You are speeding , point taken !");
          }else if( currentSpeed > 60){
              System.out.println("You drive a little bit fast , take warning !");
          }
        System.out.println( " KEEP DRIVING !");


    }



}
