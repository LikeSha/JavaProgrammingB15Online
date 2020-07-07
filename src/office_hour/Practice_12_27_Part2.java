package office_hour;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Practice_12_27_Part2 {

    public static void main(String[] args){

        OddEven(100);

        System.out.println(convertKmToMiles(1));

        System.out.println(convertGallonsToLitters(100));
        int[] array = {2,3,1,5};
        descOrder(array);
        System.out.println();

        calculate(10,5,"+");

        calculate2(10,5,'*');


    }
    // write method that can verify any number if it's even or odd
    public static void OddEven(int number){
        if(number %2==0){
            System.out.println(number + " is even number");
            //return ; -- if no return , it will exit statement immediatley and print both
            // sout " 100 is even number  100 is odd number
            return ;
        }

        System.out.println(number + " is odd number ");
    }
    /**
     * 1. write a method that can convert km to miles
     * 	 				Hint: 1 km = 0.612 miles
     * 	 	2. write a method that can convert gallons to litters
     * 	 			   Hint: 1 G = 3.75 L
     * 	 	3. write a method that can print out the array in Descending order
     * 	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
     * 	 	and prints out the calculation
     * 		if operator is not between [-, +, *, /, %] output should be Invalid Operator
     * 			Ex: calculate(10, 2, "*") ==> 20;
     * 				calculate(20, 2, "~") ==> invalid operator
     * 		5. write a method that can calculate grade
     * 					if score is 100 ~ 90 ==> A
     * 					if score is 89 ~ 80 ==> B
     * 					if score is 79 ~ 70 ==> C
     * 					if score is 69 ~ 60 ==> D
     * 					if score is 0 ~ 59 ==> F
     * 					otherwise ==> Invalid Score
     */


     // 1. write a method that can convert km to miles
     // 	 				Hint: 1 km = 0.612 miles


     public static double convertKmToMiles(double km){
         double miles = km * 0.612 ;

         return miles ;
     }

    /**
     * 2. write a method that can convert gallons to litters
     *       Hint: 1 G = 3.75 L
     *
     */

      public static double convertGallonsToLitters(double gallons){
          double litters = gallons * 3.75 ;

          return litters ;
      }


    /**
     * 3. write a method that can print out the array in Descending order
     */

      public static void descOrder(int[] array){
                       // [2,3,1,5]
          Arrays.sort(array);// [1,2,3,5] // can not use for each loop  use for loop
          for(int i = array.length-1 ; i >=0 ; i--){
              System.out.print(array[i]+ " ");
          }

      }
    /**
     * 4. write a method that accepts 3 parameters: 2 numbers and one operator,
     *       	and prints out the calculation
     *      	if operator is not between [-, +, *, /, %] output should be Invalid Operator
     *      		Ex: calculate(10, 2, "*") ==> 20;
     *      				calculate(20, 2, "~") ==> invalid operator
     */

      public static void calculate(int a , int b, String operators){
          boolean result = !operators.equals("-") || !operators.equals("+") || !operators.equals("*")
           || !operators.equals("/") || !operators.equals("%");

          if(result){
              System.out.println("Invalid operator");
              return ;
          }

          if(operators.equals("-")){
              System.out.println(a-b);
          }else if(operators.equals("+")){
              System.out.println(a+b);
          }else if(operators.equals("*")){
              System.out.println(a*b);
          }else if(operators.equals("/")){
              System.out.println(a/b);
          }else{
              System.out.println(a%b);
          }

      }

      public static void calculate2 (int a , int b, char operator){
          switch(operator){
              case '-':
                  System.out.println(a-b);
                  break ;
              case'+':
                  System.out.println(a+b);
                  break ;
              case'*':
                  System.out.println(a*b);
                  break ;
              case'/':
                  System.out.println(a/b);
                  break ;
              case'%':
                  System.out.println(a%b);
                  break ;
              default:
                  System.out.println("Invalid operator");
          }
      }


    /**
     * 5. write a method that can calculate grade
     *      * 					if score is 100 ~ 90 ==> A
     *      * 					if score is 89 ~ 80 ==> B
     *      * 					if score is 79 ~ 70 ==> C
     *      * 					if score is 69 ~ 60 ==> D
     *      * 					if score is 0 ~ 59 ==> F
     *      * 					otherwise ==> Invalid Score
     */


     public static void gradeCalculator(double score){

     }
}
