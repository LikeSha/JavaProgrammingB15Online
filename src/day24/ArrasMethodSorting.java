package day24;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays; // DO NOT CALL YOUR OWN CLASS Arrays

public class ArrasMethodSorting {


    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55} ;

        System.out.println(Arrays.toString(scores));// you need to toString first
        System.out.println("Original first item value : " + scores[0]);
        // for sorting an array in ascending order---low to high
        //sort --->> Arrays.sort(yourArrayHere) // it does not give you result back
        Arrays.sort(scores); // you just modifying your order of arrays then print it out again
        //SO WHAT HAPPEN TO MY ORIGINAL ORDER ?? GONE !!
        //CAN I GET IT BACK ? NO !!!!
        //THE ORIGINAL INDEX OF ITEMS HAS CHANGED
        System.out.println(Arrays.toString(scores));
        //first item value
        System.out.println("first item value : " + scores[0]);

        // sorting is a big topic !!! we will learn how to do it manually

        char[] nameChars = {'G','A','D','Z','C','A'} ;
        System.out.println("nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars) ;
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));

        // the low to high order for character is decided by it's ascii table value
        //special characters comes first ,number, uppercase  then lowercase

        System.out.println("-----------------character sorting----------------");
        char[] nameChars2 = {'G',' ','d','Z','9','A'} ;
        System.out.println("nameChars2 = " + Arrays.toString(nameChars2));
        Arrays.sort(nameChars2) ;
        System.out.println("after sorting nameChars2 = " + Arrays.toString(nameChars2));

        System.out.println("--------------String sorting--------------");
        //ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY
        String[] superHeros = {"Superman" , "Batman" , "Wonder Woman" , "Aquaman" , "Cyborg" ," Flash" ,"100" , "9", "09"} ;
        System.out.println("before sorting superHeros = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros));

        System.out.println("---------------boolean sorting--SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY---------");
        boolean[] fiveSwitchOnOffs = {true, false, false ,true,true } ;
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        //System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        // Arrays.sort(fiveSwitchOnOffs) ; DOES NOT WORK FOR BOOLEAN ARRAY

        //Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to RESHUFFLE THE INDEX OF ORIGINAL ARRAY OBJECT TO KEEP IT IN SORTED ORDER




    }
}
