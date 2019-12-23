package Nov27_Day15_NumberTaskWithOperator;

public class Task3 {

    public static void main(String[] args) {

        // TASK 3
        //given 3 whole numbers variable num1, num2,num3 with value already set.
        //Write a program to
        //find out the largest number and print the result

        int num1 = 28;
        int num2 = 59;
        int num3 = 39;

        if(num1 > num2 && num1>num3){
            System.out.println("num1 is the largest number " + num1);
        }else if( num2 > num1 && num2 >num3){
            System.out.println("num2 is the largest number " + num2);
        }else if( num3 > num1 && num3 > num2 ){
            System.out.println("num3 is the largest number " + num3);
        }



    }
}
