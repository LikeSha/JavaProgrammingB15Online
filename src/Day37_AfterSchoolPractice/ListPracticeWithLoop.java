package Day37_AfterSchoolPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        //Create an ArrayList of Integer and fill it up with 1-100
        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {

            //System.out.println("i = " + i);
            nums.add(number);


        }
        System.out.println("nums = " + nums);

        // change all the odd number value to 0 ;
        // from what we observed , all the odd numbers are at even index : 0,2,4,6....
        // so we can just work with those even index and set the value to 0 at those location
        for(int i=0; i<nums.size(); i=i+2){
            //System.out.println("i = " + i);
            // odd value are at index i
            nums.set(i,0);
        }
        System.out.println("nums = " + nums);

        // insert 100 to first index
        nums.add(0,100);
        System.out.println("nums = " + nums);


    }
}
