package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    /**
     * Create an ArrayList of Integer and fill it up with 1-100
     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {
            // System.out.println("i = " + i ) ;
            nums.add(number);

        }
        System.out.println("nums = " + nums);

        // change all the odd number value to 0 ;
        // from what we observed , all the odd numbers are at even index : 0,2,4,6....
        // so we can just work with those even index and set the value to 0 at those location
        for (int i = 0; i < nums.size(); i+=2) {
            //System.out.println("odd values are at index =" + i);
            nums.set(i,0);
        }
        System.out.println("nums = " + nums);

        // How to find index of value 20 :
        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));

        // INSERT 100 TO FIRST INDEX
        nums.add(0,100);
        System.out.println("nums = " + nums);

        System.out.println("indexOf(20) after insert 100 at index 0 = " + nums.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);

        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :



    }
}
