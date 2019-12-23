package day26_AfterSchoolPractice;

public class ArrayTask_NumberTest_Logic1 {

    public static void main(String[] args) {

        /*
         * // 1, given an int array
         *   write a program to test all the elementS in this int array are more that 100
         * */

        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length;
        System.out.println("size = " + size);

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not
        // if all numbers more than 100 then make it yes, if not make it no

        String finalResult = "" ;
        // LOGIC 1.2 :
        // take each item check if it is MORE than 100, increase the count.
        // in the end if count is equal to array item count the finalResult Yes, answer is NO,

        int cntLessThan100 = 0 ;
        for(int eachNum  : scores){
            if(eachNum <100){
                System.out.println("eachNum = " + eachNum);
                cntLessThan100++ ;
            }

        }

        System.out.println("count = " + cntLessThan100);
        if( cntLessThan100 > 0) {
            finalResult = "NO" ;
        }else{
            finalResult = "YES" ;
        }
        System.out.println("finalResult = " + finalResult );



    }
}
