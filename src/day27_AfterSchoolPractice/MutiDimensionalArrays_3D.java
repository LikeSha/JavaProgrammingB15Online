package day27_AfterSchoolPractice;

import java.util.Arrays;

public class MutiDimensionalArrays_3D {

    public static void main(String[] args) {
     // 2D Array : contains 1D dimensional array
        int[][] arr2D ={{1,2,3} ,{4,5,6}};
        //[index of 1D array][index num of values]
    //3D Array : contains 2D array
        //                   0         1           0       1
        int[][][] arr3D ={{{1,2,3} ,{4,5,6}}, {{7,8,9},{10,11,12}}};
        //                         0                  1

        //  [index num of 2D array][index num of 1D array][index num of values]

        // print 9 :
        System.out.println(arr3D[1][0][2]); // returns value

        // print 2
        System.out.println(arr3D[0][0][1]); // returns value

        // print {1,2,3}
        System.out.println(arr3D[0][0]);  // returns 1d array
        System.out.println(Arrays.toString(arr3D[0][0]));



        // print {10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1]));// returns 1d array

        // print {{7,8,9},{10,11,12}}
        System.out.println(Arrays.deepToString(arr3D[1]));//toString method only print single dimensional array
        // multi dimensional arrays need to use deepToString to print out

        System.out.println(Arrays.deepToString(arr3D));





    }
}
