package RtplSelfPractce;

public class Repl113_ArraysCountOFEvenNumber {

    public static void main(String[] args) {

        /**Given an array nums, calculate the count of even numbers in nums and print out to console.

         nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
         nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
         nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
         // loop through the array and get the count of the even numbers

         */

         int[] nums = new int[]{2, 1, 2, 2, 1, 2,  3,  4, 3, 4};

         int count = 0 ;

         for (int i = 0; i <nums.length ; i++) {

            if((nums[i]%2==0)){ // if((nums[i]%2==1)){
                count++ ;      //   count++ ;              this right part three conditons print out only even number
                               //  continue;

            }

        }
             System.out.println(count);



            /**
             *   this problem second solution is usint for each loop :
             *
             *   int evenNumberCount = 0 ;
             *             for( int evenCount : nums){
             *
             *             if(evenCount%2 ==0 ){
             *
             *                  evenNumberCount ++ ;
             *
             *             }
             *             System.out.println(evenNumberCount) ;
             *
             *
             *
             *
             */





    }
}
