package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        // given an array check if this array is already sorted
        //int[] nums = {13,31,8,5,21,2} ;
        int[] nums = {1,7,3,4,5,6};

        System.out.println("nums = " + Arrays.toString(nums));
       // storing the size of an array into a variable
        int numsItemCount = nums.length ;

        // I want to copy the content of nums array into the new array
        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount] ;
        numsCopy[0] = nums[0]; // 13 // copying one by one from original array
        numsCopy[1] = nums[1];
        numsCopy[2] = nums[2];
        numsCopy[3] = nums[3];
        numsCopy[4] = nums[4];
        numsCopy[5] = nums[5];
        // copying the value of one array into the new array
        for (int x = 0; x < numsItemCount; x++) {

            numsCopy[x] = nums[x] ;// this line is copying nums array items into numsCopy array

        }
        System.out.println(" before sort numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = " + Arrays.toString(numsCopy) );

        // check whether the array still have same content in same order after sorting
        // what method will check for content

        if( Arrays.equals(nums,numsCopy)){
            System.out.println("THIS ARRAY IS ALREADY SORTED");
        }else{
            System.out.println("THIS ARRAY IS NOT SORTED ");
        }

        // plain english logic to see a set of 7 number is sorted or not
        //you copy this 7number in another container
        //sort the number and check whether it will has same order as original number
        //why did we

    }





}
