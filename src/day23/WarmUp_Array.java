package day23;

import jdk.swing.interop.SwingInterOpUtils;

public class WarmUp_Array {

    public static void main(String[] args) {

        // create an int array of 7 items
        // assign values
        //1 , print out in reverse order
        //2, store last item in a variable called lastItem
               // print it out separately
        //3,print the item right in the middle

        //  OPTIONALLY : find sum ,find average ,find max , find min

        // first way to create an array object and add value into index locations
        int[] nums = new int[7];
        nums[0] = 11 ;
        nums[1] = 2 ;
        nums[2] = 23 ;
        nums[3] = 4 ;
        nums[4] = 53 ;
        nums[5] = 6 ;
        nums[6] = 3 ;


        // 2nd way to create an array with values already filled
        int[] nums2 = new int[]{11,2,34,4,53,6,3} ;

        // 3rd and shortest way
        // THIS MUST HAPPEN IN ONE LINE , WE CAN NOT DECLARE FIRST AND ASSIGN LATER
        int[] nums3 ={11,2,34,53,6,3,78};

        for (int x = nums.length-1;x >= 0 ; x--){

            System.out.println("index " + x + " : " + nums[x]);
        }
        // find out last index so we can do array reversely printed
        int arraySize = nums.length;
        int lastItemIndex = arraySize-1 ;

        int lastItemValue = nums[lastItemIndex] ;
        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIndex = arraySize/2 ;
        System.out.println("middle item value = " + nums[middleItemIndex]);

        // find the sum of numbers

        int sum= 0 ;
        for (int x = 0; x < arraySize ; x++) {

            int currentItem = nums[x];
            //sum= sum + currentItem ;
            sum= sum + nums[x] ;  // sum +=nums[x]

        }
        System.out.println("sum = " + sum);

        // find the max number

        int max = nums[0];
        for (int i = 0; i <arraySize ; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);

        // find minimum number

        int min = nums[0];
        for (int i = 0; i <arraySize ; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("min = " + min);

        // find average number is :

        int averageNumber = sum/arraySize;
        System.out.println("averageNumber = " + averageNumber);






        // below is my answer for task 1,2,3
//        int[] num = new int[]{1,4,6,9,12,5,2};
 //       int itemCount = num.length ;
 //       for (int x = itemCount-1; x >= 0 ; x--) {

//            System.out.print(num[x]+ " ");



 //       }
 //       System.out.println();
 //          int lastItem = num[itemCount-1] ;
 //          System.out.println("lastItem = " + lastItem) ;

//           int middleItem = num[num.length/2];
 //       System.out.println("middleItem = " + middleItem);





    }
}
