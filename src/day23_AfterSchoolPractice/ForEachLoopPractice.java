package day23_AfterSchoolPractice;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /**Create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         * OPTIONALLY :
         * print only the salary more than 100000
         ** optionally :
         *   use for each loop to find the max
         *   use for each loop to find the sum
         **/

        long[] salaries = {110000, 87342,98374,67493,74850} ;

        for(long desiredSalary : salaries   ){

            System.out.println("My desired Salary are : " + desiredSalary);
        }

        System.out.println("-----------print out salary above 100k only-------");

         for( long salary : salaries){ // you can put if statement inside for each loop and other loops

  //           if(salary > 100000){
  //               System.out.println("salary = " + salary);
   //          }

             if(salary <= 100000){
             continue;
         }
             System.out.println("salary = " + salary);
         }


    }
}
