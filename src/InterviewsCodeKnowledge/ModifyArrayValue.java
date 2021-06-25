package InterviewsCodeKnowledge;

public class ModifyArrayValue {

    public static void main(String[] args) {

        int yourFavNumber = 300 ;
        int myFavNumber =  yourFavNumber ;

        myFavNumber = 299 ; //myFavNumber does not change yourFavNumber
        System.out.println(yourFavNumber);

        long[] nums = {10, 40, 20 };
        // how do I change double my first item in the array
//        nums[0] = nums[0] * 2 ;// nums[0] *= 2 ;
//        System.out.println(nums[0]);    // always asking by interview this question !



        for (int x = 0; x < 3 ; x++) {

            // System.out.println(nums[x] * 2); // JUST PRINTING WONT CHANGE THE VALUE
            long eachItem = nums[x] ;
            eachItem = 100 ; // eachItem does not affect nums[x] use debug check
            nums[x] = nums[x] * 2 ; // here we are doubling the value of each item
        }

        for( long eachItem : nums){
            eachItem = 100 ;
        }
        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS // THIS SENTENCE ALWAYS ASKED IN INTERVIEW !!!!!!
        //FOR LOOP YOU CAN MODIFY DATA
        //example : arrayVariableName[index] = something  will modify data
        // eachItem = some value will NOT MODIFY !!!
        // how do I know array items are modified or not  re-print

        System.out.println("AFTER WE MODIFY THE VALUE ");
        for (int x = 0; x < 3; x++) {

            System.out.println(nums[x]);

        }



    }
}
