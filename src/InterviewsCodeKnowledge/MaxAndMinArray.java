package InterviewsCodeKnowledge;

public class MaxAndMinArray {

    public static void main(String[] args) {
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
                max = nums[index];
            }


            if(nums[index] > secondMax && nums[index] !=max ){
                secondMax = nums[index];
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


    }





}
