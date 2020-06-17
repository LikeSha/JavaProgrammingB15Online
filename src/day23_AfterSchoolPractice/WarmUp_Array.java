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

        int[] nums = {34,56,833,3,98,4,67};

        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        int arraySize = nums.length;
        int lastItemIndex = nums.length-1;// arraySize-1
        int lastItemValue = nums[lastItemIndex];
        System.out.println("Last Item Value is : " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("middle item value is " + nums[middleItemIndex]);
        
        int sum = 0;
        for (int i = 0; i <arraySize ; i++) {
            sum += nums[i];
        }
        System.out.println("sum = " + sum);

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
    }
}
