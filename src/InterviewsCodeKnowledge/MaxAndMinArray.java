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

        System.out.println("--------------2 dimensional array find max ------------");

        int[][] numbers = { {12,11,10,19} , {19,20,15}} ;

        // find out the max number from above 2d arrays
        int max1 = numbers[0][0] ; // assume that first element is the max

        for (int i = 0; i < numbers.length ; i++) {// checks each single dimensional array
            for (int j = 0; j <numbers[i].length; j++) {// check each elements in single dimensional array
                if(max1 < numbers[i][j]){// compares index 0 of teh array with each indexes
                    max1 = numbers[i][j] ;
                }
            }

        }
        System.out.println("max1 = " + max1);

        // solution 2  using for each loop to find out the max number
        System.out.println("===solution 2 using for each loop to find out the max number=======");

        int max2 = numbers[0][0];

        for( int[] each1DArray : numbers) { // variable each1DArray represents each single dimensional array
            // in numbers

            for( int eachInt : each1DArray){
                if(max2 < eachInt){
                    max2 = eachInt ;
                }
            }
        }
        System.out.println("max2 = " + max2);

        System.out.println("============find out the minimum number in 2 dimensional array===========");

        int min1 = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if(min1 >numbers[i][j]){
                    min1 = numbers[i][j];
                }

            }

        }
        System.out.println("min1 = " + min1);

//        System.out.println("=======finding the longest words ============================================");
//        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"} ;
//        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi" ,"Nursultan"} ;
//        String[] businessAnalysistTeam = {"Lisa" , "Ershad","Naila"} ;

        //       String[][] scrumTeam = {}



    }


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





