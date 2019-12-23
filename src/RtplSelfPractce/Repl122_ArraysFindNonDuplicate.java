package RtplSelfPractce;

import java.util.Scanner;

public class Repl122_ArraysFindNonDuplicate {

    public static void main(String[] args) {

        /**Given an array nums with 7 integers every element is repeated twice - except one.
         * Find that element and print it to console.

         Example:

         nums -> [1, 1, 2, 3, 4, 3, 4]
         2
         *
         */

        // this question solution is on Dec 12 office hour  minute; 48

        Scanner input = new Scanner(System.in);


        System.out.println("Enter 7 whole numbers");
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};



        for (int j = 0; j < nums.length ; j++) {

            int countOfUniqueNumber = 0 ;

            for (int i = 0; i < nums.length ; i++) {
                if(nums[i] ==nums[j]){
                    countOfUniqueNumber ++ ;
                }
            }
            if(countOfUniqueNumber == 1){
                System.out.println("countOfUniqueNumber = " + nums[j]);
            }
        }




    }
}
