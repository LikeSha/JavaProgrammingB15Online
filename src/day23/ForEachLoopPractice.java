package day23;

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
         *
         * optionally :
         * use for each loop to find the max
         * use for each loop to find the sum
         *
         **/
        // teacher's homework is :
        long[] salaries = new long[]{100000L, 200000L,150000L,115000L,60000L};

        for(long eachSalary   : salaries){

            System.out.println("eachSalary = " + eachSalary);



        }
        System.out.println("-----------print out salary above 100k only-------");
         // below print out salary more than 100000
        for(long salary :salaries ){

 //           if(  salary> 100000){
 //               System.out.println("blabla = " + salary);
 //           }
            // how can I skip salaries less than or equal to 100000
            if(salary <= 100000){
                continue;
            }
            System.out.println("salary = " + salary);

        }



    }
}
//            below is my homework

//            long[] salaries = {57476, 69497, 86271, 73795,10803};

//            for(long desiredSalay :salaries){
//            System.out.println("desiredSalay = " + desiredSalay);