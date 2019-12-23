package day23_AfterSchoolPractice;

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

        int[] nums = new int[]{4,8,29,40,34,87,45};
        for (int i = nums.length-1; i >= 0 ; i--) {

            System.out.println("index of " +  i + " is " + nums[i]);

        }
         int arraySize = nums.length ;
         int lastItemIndex = nums.length - 1 ;// arraySize-1
         int lastItemValue = nums[lastItemIndex] ;

        System.out.println("last Item value is : " + lastItemValue);

        int middleItemIndex = arraySize/2 ;
        System.out.println("middle item value = " + nums[middleItemIndex]);

        int sum = 0 ;
        for (int x = 0; x < arraySize ; x++) {

            //int currentItem = nums[x] ;
           // sum = sum + currentItem ;
            sum = sum + nums[x] ; // sum += nums[x] ;

        }
        System.out.println("sum = " + sum);

    }
}
