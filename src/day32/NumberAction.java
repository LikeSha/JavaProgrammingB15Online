package day32;

public class NumberAction {

    public static void main(String[] args) {

        numberComparision(1,2);
        stringRepeater("java",10);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        contDownByEvenNumberFromXtoY(10,6);
        print1toX(20);


    }
    /**
     * Create static void methods as below
     *
     * numberComparision
     * this method has 2 parameters called num1 and num2
     * if num1 is more than num2 print num1 is more than num2
     * if num2 is more than num1 print num2 is more than num1
     * if num2 are equals num1 print they are equal
     *
     * String repeater
     * this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
     *
     * skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     *
     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     *
     * print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     *
     *
     */

     public static void numberComparision(int num1 , int num2){
         if(num1 > num2){
             System.out.println(num1 + " is more than " + num2);
         }else if( num2 > num1){
             System.out.println(num2 + " is more than " + num1);
         }else{
             System.out.print(num1 + " and " + num2 + " are equal ");
         }
     }

    public static void stringRepeater(String strToRepeat ,int count){
        for (int i = 1; i <= count ; i++) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();
     }


       public static void skipCountBy3From0to50(){
           for (int i = 0; i <50 ; i = i + 3) {
            //if(i%3==1)
               System.out.print(i+ " ");
           }
           System.out.println();
     }

        public static void countDownByEvenNumberFrom50to0(){
            for (int i = 50; i >=0; i--) {
                if(i%2==0)
                System.out.print(i+ " ");
            }
            System.out.println();
     }
           // instead of contDownByEvenNumberFrom50to0
           // now count Down by EvenNumber from x to y
          //contDownByEvenNumberFromXtoY();

         public static void contDownByEvenNumberFromXtoY(int x, int y){
            // if x=6 y = 10  ,you don't even enter the loop,because the condition is false
             // 6 IS NOT GREATER THAN 10 SO CAN NOT COUNT DOWN FROM 6 TO 10 ! order is MATTER !
             for (int i = x; i >= y ; i--) {

                 if(i%2 == 0){
                     System.out.print(i + " ");
                 }
             }
             System.out.println();
         }


         public static void print1toX ( int x){
             for (int i = 1; i <=x ; i++) {
                 System.out.print(i+ " ");
             }
             System.out.println();
     }
}
