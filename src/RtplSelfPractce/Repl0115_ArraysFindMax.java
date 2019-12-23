package RtplSelfPractce;

public class Repl0115_ArraysFindMax {

    public static void main(String[] args) {

        /**Given an array num, get the max number in nums and print out to console.

         nums → [2, 4, 2, 3, -2]) → 4
         nums → [2, 2, 5, 3, 0 ]) → 5
         nums → [1, 33, 5, 7, 9]) → 33


         hint:
         create a variable called max and before you start searching assume the first item value is the max.
         loop through each and every item and check for whether the value max is less than the item value.
         if so assign the value to the max to overwrite existing max.
         you will get the max value when you are done with the loop

         */

        System.out.println("======below using for each loop=============");

         int[] nums = {1, 33, 5, 7, 9} ;
         int max = nums[0] ;

         for( int maxNum : nums){

             if(maxNum > max ){
                 max = maxNum ;
              }
         }
            System.out.println(max);

        System.out.println("============below using only for loop in stead of for each loop=====");

        for (int index = 0; index <nums.length ; index++){

            if(nums[0] > max){
                max = nums[0] ;
            }
        }
        System.out.println(max);

    }
}
