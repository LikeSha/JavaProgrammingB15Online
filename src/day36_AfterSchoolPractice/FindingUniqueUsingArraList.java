package day36_AfterSchoolPractice;

import java.util.ArrayList;

public class FindingUniqueUsingArraList {

    public static void main(String[] args) {

        int[] nums = {11,33,44,11,33,44,22,55,44,33};

        ArrayList<Integer> uniqueLst = new ArrayList<>();

        for( int each :nums){

            System.out.println("each = " + each);
            if(! uniqueLst.contains(each))
            uniqueLst.add(each);


        }
        System.out.println("uniqueLst = " + uniqueLst);

    }
}
