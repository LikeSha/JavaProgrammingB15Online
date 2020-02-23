package day38_AfterSchoolPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAList {

    public static void main(String[] args) {

        // reversing an ArrayList object

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,100,700,400,500));

        Collections.reverse(nums1);
        System.out.println("nums1 = " + nums1);
        Collections.sort(nums1,Collections.reverseOrder());
        System.out.println("nums1 = " + nums1);



    }
}
