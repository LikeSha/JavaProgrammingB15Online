package Nov27_Day15_NumberTaskWithOperator;

public class Task2 {

    public static void main(String[] args) {

        // TASK 2
        //given 3 whole numbers variable num1, num2,num3 with value already set.
        //and another int variable called sumOfSpecialNumber with initial value 0
        //Write a program to print
        //If the sum of the numbers are more than 100!

        int num1 = 28;
        int num2 = 59;
        int num3 = 39;

        int sumOfThreeNumber = num1 + num2 + num3 ;

        int sumOfSpecialNumber = 0 ;
        sumOfSpecialNumber= 100 ;

       if(sumOfThreeNumber>sumOfSpecialNumber){
           System.out.println("sum of the numbers are more thant " + sumOfSpecialNumber);
       }else{
           System.out.println("sum of the numbers are less thant " + sumOfSpecialNumber);
       }





    }
}
