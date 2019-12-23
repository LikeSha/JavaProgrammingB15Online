package day31;

public class DailyRoutine {

    public static void wakeUp(){

        System.out.println("Open your eye,only one");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again!");
        System.out.println("------------------------");

    }

    public static void drinkCoffee(){

        System.out.println("Put coffee into your coffee machine");
        System.out.println("Press the button Make your coffee");
        System.out.println("--------------");

    }

    public static void prepareKidsForSchool(){

        System.out.println("Kiss your kids to wake them up");
        System.out.println("Wake them up for 10 times");
        System.out.println("Prepare their breakfast and lunch");
        System.out.println("Eat with them");
        System.out.println("-----------------");
    }

     public static void takeThemToSchool(){

         System.out.println("Take them to school bus");
         System.out.println("Say good bye!!!");
         System.out.println("--------------------");
    }

     public static void studyJava(){

         System.out.println("Think about java waking up");
         System.out.println("Think about java drinking Coffee");
         System.out.println("Think about java preparing kids forSchool");
         System.out.println("Think about java taking the to shool");
         System.out.println("Eventually sit down and study java, practice practice !!!");
         System.out.println("Review last classes ,come ready for the calss");
     }



     public static void sayIloveJava300Times(){

         for (int i = 1; i <=300 ; i++) {
             System.out.print("I Love Java |");

         }
         System.out.println();
    }

     public static void main(String[] args) {

         wakeUp();
         drinkCoffee();
         prepareKidsForSchool();
         takeThemToSchool();
         studyJava();
         sayIloveJava300Times();

         /**
         * wakeUp
         * drinkCoffee
         * prepareKidsForSchool
         * takeThemToSchool
         * goToWork
         * groceryShopping
         * cooking
         * studyJava
         * goToSleep
         */

    }


}
