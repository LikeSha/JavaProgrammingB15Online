package day27;

import java.util.Arrays;

public class MultiDmensionalArray_3D {
    // N dimensional Aarray MUST contains {N-1) dimensional arrays

    public static void main(String[] args) {

        // 2D Array : contains 1 dimensional array
        int[][] arr2D = {{1,2,3} , {4,5,6}};
        // [index num of 1D array][index num of values]

        // 3D Array: contains 2D array
        //                     0       1             0         1
        int[][][] arr3D = {{{1,2,3},{4,5,6}}   , {{7,8,9}, {10,11,12}}};
        //                       0                        1
        // [][][]
          //[index num of 2D Array][index num of 1D array][index num of each element value]

        // print 9 :
        System.out.println(arr3D[1][0][2]); // returns value

        // print 2
        System.out.println(arr3D[0][0][1]); //returns value

        // print {1,2,3} ;
        System.out.println(arr3D[0][0]); // returns 1d array
        System.out.println(Arrays.toString(arr3D[0][0]));

        // print{10,11,12}
        System.out.println(arr3D[1][1]); // returns 1d array
        System.out.println(Arrays.toString(arr3D[1][1]));

        // print { {7,8,9} , {10,11,12} }
        System.out.println( arr3D[1]); // RETURNS 2D array
        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(   Arrays.toString(arr3D)); // toString method only print single dimentional array
        // multi dimensional arrays need to use deepToString to print out
        System.out.println(Arrays.deepToString(arr3D));






    }

}
