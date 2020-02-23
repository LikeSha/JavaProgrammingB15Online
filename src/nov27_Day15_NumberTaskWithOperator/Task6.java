package nov27_Day15_NumberTaskWithOperator;

public class Task6 {

    public static void main(String[] args) {

        // TASK 6
        //given 3 whole numbers variable num1, num2,num3 with value already set.
        //Write a program with below logic
        //if multiplication result of num1 and num2 greater than sum of all the numbers
        //print excellent result
        //else not the numbers combination I am looking for

        int num1 = 4;
        int num2 = 5;
        int num3 = 6;

        if(num1*num2>(num1+num2+num3)){
            System.out.println("excellent result");
        }else{
            System.out.println("not he numbers combination I am looking for");
        }



    }


}
