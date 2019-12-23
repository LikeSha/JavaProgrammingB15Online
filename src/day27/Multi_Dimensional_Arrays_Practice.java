package day27;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {
        // N dimensional Array MUST contains (N-1) dimensional arrays

        // 2 dimensional array MUST contains (2-1) dimensional arrays
        //                           0             1          0           1
        String[][] names = {     {"Rukhshona" , "Ghoya"} , {"Hasan" , "Tetiana"}     } ;
        //                                    0                    1
        // print Hasan :
        System.out.println(names[1][0]);
        // print Tetiana
        System.out.println(names[1][1]);
        // change Tetiana to Dilshat
        names[1][1] = "Dilshat" ;   //
        System.out.println(names[1][1]);

        // print Hasan and Dilshat
        System.out.println(names[1]);
        System.out.println(Arrays.toString(names[1]));

        // print {     {"Rukhshona" , "Ghoya"} , {"Hasan" , "Tetiana"}     } ;
        System.out.println(Arrays.deepToString(names));

        System.out.println("====================================================");

        int[][] numbers = { {1,2,3} ,{4,5,6} , {7,8,9} , {10,11,12,13}} ;
        //                    0         1          2           3

        // I want to print out each and single elements in each arrays
        for (int i = 0; i <numbers.length  ; i++) { // check each index of two dimensional array
           // System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length ; j++) { // j checks each elements of single array
                System.out.print(numbers[i][j] + " ");

            }
        }


        System.out.println("=================print out each and every even numbers===================================");
        // print out each and every even numbers

        int[][] ages = {{10} , {12,13,14,15,16,17} , {19,20,21,22,23}} ;

        for (int i = 0; i <ages.length ; i++) {

            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j] %2 != 0){ // if print out odd number : if(ages[i][j] %2 == 0){
                    continue ;  // if(ages[i][j] %2 == 0
                }                 //
                System.out.print(ages[i][j] + " "); //  System.out.println(ages[i][j] + " ");

            }
        }
        System.out.println("=========================================");

        int[] arr1D = { 1,2,3};

        for( int  each : arr1D){
            System.out.println(each);
        }
        System.out.println("=============print out 2 dimensional array using for each loop========= ");

        int[][] arr2D = {{10,20,30} , {40,50,60,70,80,90,100}} ;
        //                   0                   1
        for( int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));
        }

        System.out.println("====print out each and every element in above 2 dimensional array ");

        for( int[] each1DArray : arr2D) {// variable name each1DArray represents each index
            for( int eachElement : each1DArray){
                System.out.print(eachElement + " ");
            }

        }

    }
}
