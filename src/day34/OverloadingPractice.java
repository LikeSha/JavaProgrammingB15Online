package day34;

public class OverloadingPractice {

    /**
     * create 3 static void overloaded version of add method
     * 1, add
     *     has 1 int parameter and add 100 to that number and print out the result
     *     and print out the result
     *  2, add
     *     has 2 int parameters and add them to get sum and print out the result
     * 3, add
     *     has 3 int parameters and add them to get sum and print out the result
     * 4, add
     *     has 2 long parameters and add them to get sum and print out the result
     *
     */

    public static void main(String[] args) {

         // METHOD OVERLOADING IS ALWAYS COME TO INTERVIEW QUESTION !! MUST UNDERSTAND IT 1!!!!
        add(3);
        add(10,34);
        add(23,45,56);
        add(3456938L,479076831L);
    }

     public static void add(int num){
         // DO I ALREADY HAVE A METHOD THAT ADD 2 NUMBERS ?
       System.out.println(num + 100);
         //add(num,100); // we can do this to reuse functionally we already have :  line 32
     }
     public static void add(int num1,int num2){
         //int sum = num1 + num2 ;
        System.out.println(num1 + num2);
     }
     public static void add(int num1, int num2,int num3){
        //int sum = num1 + num2 + num3 ;
         System.out.println(num1 + num2 + num3);
     }
     public static void add(long l1,long l2){
         //long sum = l1 + l2 ;
        System.out.println(l1 + l2);
     }

}
