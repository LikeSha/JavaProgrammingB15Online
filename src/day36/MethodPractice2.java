package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {

        long[] myLongs = {6L,11L,44L,32L,65L};
        System.out.println("Before swap myLongs = " + Arrays.toString(myLongs));

        swapFirstAndLastValue(myLongs);
        System.out.println("After swap myLongs = " + Arrays.toString(myLongs));

        long[] myNum1 = new long[5];
        System.out.println("myNum1 = " + Arrays.toString(myNum1));

        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));

        int x = 0 ;
        Integer x1 = null ;

        // ONE THING THAT PRIMITIVE VARIABLES CAN NOT DO IS :
        //  WE CAN NOT ASSIGN IT TO NULL
        // ANY NON-PRIMITIVE VARIABLES
         // CAN ASSIGNED TO NULL VALUE
         // TO DEFINE, IT'S NOT POINTING TO ANY OBJECT YET


    }
    // write a static void method to accept a long array.
    // It should swamp first value with last value of the array

    /**
     * swap first and last value of long array
     * @param nums long array
     */

    public static void swapFirstAndLastValue(long[] nums){
        // just like swapping the tea in tea cup with coffee in coffee cup
        // you need a temporary cup to hold your tea so you can put your coffeee in
        // and put your tea back into coffee cup
        // nums[0] , nums[ nums.length-1]
        long temp = nums[0];              // putting tea in the teacup to temp cup
        nums[0] = nums[nums.length-1];    // putting coffee into tea cup
        nums[nums.length-1] = temp ;      // putting tea(in temp cup ) into coffee cup

    }


}
