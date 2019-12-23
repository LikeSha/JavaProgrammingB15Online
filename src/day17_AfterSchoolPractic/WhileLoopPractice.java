package day17_AfterSchoolPractic;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // Count 1 to 5 then count 5 to 1
        int counter = 1 ;

        while(counter <= 5){

            System.out.print(counter + " ");
            ++counter ;
        }
        System.out.println();// by typing this it gives you an empty line , in another word
                             // to this case , it will print on the second line
        System.out.println("counter = " + counter);
        // now I want to count from 5 to 1  ,using same counter
        while(counter >1){

            --counter;
            System.out.print(counter + " ");

        }



    }
}
