package rtplSelfPractce;

import java.util.Scanner;

public class Repl121_ArraysCountEvens {

    public static void main(String[] args) {

        /**Given an array nums, calculate count of even numbers in nums (not their values!)
         * and print out to console.

         nums → [2, 1, 2, 3, 4]) → 3
         nums → [2, 2, 0, 3, 5]) → 3
         nums → [1, 3, 5, 7, 9]) → 0
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers");
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int countOfEven = 0 ;
        for (int i = 0; i < nums.length; i++) {
          if(nums[i]%2==0){
                countOfEven ++ ;
           }
       }

        System.out.println("countOfEven = " + countOfEven);

//        System.out.println("=====second solution for each loop=====");

//        for(int eachNum : nums){
 //           if(eachNum %2 !=1);
//            countOfEven ++ ;


//        }
 //       System.out.println("countOfEven = " + countOfEven);
    }
}
