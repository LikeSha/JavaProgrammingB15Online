package day15_AfterSchoolPractice;

public class NameChecker {

    public static void main(String[] args) {

        // TASK 1 :

        // Name Checker
        //Declare a variable to store your name
        // check whether your name length is less than 4
        // if so print short name
        // if it is within 4-11  print medium name
        // if it's more than 11 , print longer name
        //--------------------------------------------------

        // check whether your name has either character a or e
        // if so -->> name with a or e
        // if not -->> I don't have both a and e in my name

        // CHECK OUT THE TEACHERS VERSION --SCAN VERSION IN THE CLASS

        String myName = "Salik" ;
        int lengthOfName = 5 ;
        if(myName.length()<4){
            System.out.println("short name ");
        }else if(lengthOfName >= 4 && lengthOfName<=11){
            System.out.println("medium name");
        }else if( lengthOfName > 11){
            System.out.println("longer name");

        }


         if(myName.contains("a") || myName.contains("e")){
             System.out.println("name with a or e");
         }else{
             System.out.println("I dont have a or e in my name ");
         }


    }
}
