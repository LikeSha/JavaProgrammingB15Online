package InterviewsCodeKnowledge;

import java.util.Arrays;

public class MaxAndMinArray {

    public static void main(String[] args) {

        /*
        // Array.sort(variableName) : sorts the array in ascending order ,

        // this method use to find out largest number in an array.

        Arrays.sort(numbers) ;

        int largestNumber = numbers[numbers.length -1 ] ;
        int minNumber = numbers[0] ;
        System.out.println("Minimum number is " + minNumber );
        System.out.println("Largest number is " + largestNumber);

        // write  a program that can find the minimum numbers from an
        // int array  // find out largest and minimum number is interview
        //question !

      */

        // to print out human readable array , do this :
       // System.out.println(Arrays.toString(nums));

        // how to find biggest number ? second biggest number ? and minimum number?
        //lets assume that 1st value is the largest one

        // first method : use for loop

        int[] nums = new int[]{-45,1,3,456,4,5,7} ;

        int max = nums[0];
        int secondMax = nums[0];
        int min = nums[0];

        for (int index = 0; index <nums.length ; index++) {
            if(nums[index]>max){
                if(nums[index] > secondMax && nums[index] !=max ){
                    secondMax = nums[index];
                }
                max = nums[index];
            }



            if(nums[index] < min){
                min = nums[index];
            }
        }

        System.out.println("Max is " + max);
        System.out.println("Second max number is " + secondMax);
        System.out.println("Mininum number is " + min);


        /*
           another solution for find max :
           another solution is to use continue statement to find max
             int max = nums[0];
             for(int eachNum : nums){
               if(eachNum < max ){
                  continue;
             }
             max = eachNum;




         finding the second max solution :
          after finding out the max number, then you use for each loop
          to find out the second max :

           float SecondMax = prices[0];   // store the second max number

        for (float eachPrice : prices) {
            if (eachPrice > SecondMax && eachPrice < max) {
                SecondMax = eachPrice;
            }
        }
         */


        // another solution find min ,second min ,third min numbers....


        /*
          int[] scores ={100,897,654,32,1231,224,556,7,1,2,3,4} ;
        int min = scores[0] ;

        for (int i = 0; i <scores.length ; i++) {

            if(scores[i]<min){
                min = scores[i] ;
            }

        }
        System.out.println("minimum number : " + min);

        // find the second minim number

        int secondMin = scores[0] ;
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min){
                continue ;
            }
            if(secondMin > scores[i]){
                secondMin = scores[i] ;
            }
        }
        System.out.println("Second minimum number is : " + secondMin);

            // find out 3rd minimum number
        int thirdMin = scores[0] ;
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }
            if(thirdMin > scores[i]){
                thirdMin = scores[i] ;
            }
        }
        System.out.println("Third minimum number is : " + thirdMin);

         */


    }





}
