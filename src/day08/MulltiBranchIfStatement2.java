package day08;

public class MulltiBranchIfStatement2 {

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
        int currentSpeed = 65;
        if (currentSpeed > 90) {
            System.out.println("JAIL TIME");
        } else if (currentSpeed > 80) {
            System.out.println("reckless driving");
        } else if (currentSpeed > 70) {
            System.out.println("point taken");
        } else if (currentSpeed > 60) {
            System.out.println("warning");
        } else {
            System.out.println("KEEP DRIVING");
        }


    }
}