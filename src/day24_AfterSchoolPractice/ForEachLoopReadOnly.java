package day24_AfterSchoolPractice;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300 ;
        int myFavNumber = yourFavNumber ;

        myFavNumber = 299 ; // myFavNumber does not change yourFavNumber
        System.out.println(yourFavNumber);
        //System.out.println(myFavNumber);// myFavNumber does not change yourFavNumber

        long[] nums = {10,40,20};
        // how do I change double my first item in the array
       // nums[0]= nums[0] * 2 ;// nums[0] *= 2 ; // by doing this ,the actual value changed !!!
       // System.out.println(nums[0]);

        for (int x = 0; x < 3 ; x++) {

           // System.out.println(nums[x] * 2); // this is only double value in print , not actual value
                                 // you can re print as below to check the actual value .!! very important
                                // concept
            long eachItem = nums[x];//when you do this , it just copying the value inisde array,doesnt change value
            eachItem = 100 ;
           // nums[x] = nums[x] * 2 ; // this one actually changed value ! it equals nums[0]= nums[0] * 2 ; as above

        }

        for(long eachItem : nums){
            eachItem = 100 ;
        }
         // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS

        // how do I know array items are modified or not :  re-print

        System.out.println("AFTER WE MODIFY THE VALUE");
        for (int x = 0; x < 3 ; x++) {

            System.out.println(nums[x]);

        }

    }
}
