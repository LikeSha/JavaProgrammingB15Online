package day27;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {

    public static void main(String[] args) {

        /**Single dimensional array : contains values
         * int[] arr = {1,2,3};
         *
         * Multi-dimensional array : an array that contain array(s)
         *      N dimensional Array MUST contains (N-1) dimensional arrays
         *      ex: 2 dimensional array : contains 1 dimensional arrays
         *  int[][] arr2D = {  {1,2,3},{4,5,6}  } // in this curley braces you can only store one single dimensional array

         */
        int[] arr1D = {1,2,3} ;
        // [index num of elements]
         // arr1D[1] ===>2



        // 2D array: is an array that contains single dimensional arrays
       //                    0 1 2    0 1 2
        int[][] arr2D = {   {1,2,3} ,{4,5,6}   } ;
        // index              0         1

        // [INDEX NUM OF 1D ARRAYS] [ INDEX NUM OF ELEMENTS ]

        // arr2D[0] ===> {1,2,3}
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));// returns int array
        System.out.println(Arrays.toString(arr2D[1])); // returns int array



        // arr2D[0][2] ===>3
        System.out.println( arr2D[0][2]); // RETURNS INT VALUE

        // print 5 : arr2D[1][1]
        System.out.println(arr2D[1][1]); // returns int value

        System.out.println(Arrays.toString(arr2D[1]));// Arrays.toString in only applicable to single
                                                   // dimensional array

        // Arrays.deepToString(multi-D Arrays) :
        System.out.println(Arrays.deepToString( arr2D));






    }
}
