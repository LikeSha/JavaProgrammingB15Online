package day36_AfterSchoolPractice;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {
        //write a static void method to accept a long array.
         //It should swamp first value with last value of the array
        long[] myLongs = {6L,34L,56L,23L,};
        System.out.println("Before swap myLongs = " + Arrays.toString(myLongs));

        swapFisrtAndLastValue(myLongs);
        System.out.println("After swap myLongs = " + Arrays.toString(myLongs));
    }

    /**
     * Swap first and last value of long array
     * @param nums
     */

     public static void swapFisrtAndLastValue(long[] nums){

         // nums[0] , nums[nums.length-1]
         long temp = nums[0];
         nums[0] = nums[nums.length-1];
         nums[nums.length-1] = temp ;
     }

}


