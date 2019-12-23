package day27;

import java.util.Arrays;

public class ArraysPractice_3dArray {

    public static void main(String[] args) {


        int[][][] arr3D = {{{1,2,3},{4,5,6}}   , {{7,8,9}, {10,11,12}}};

        for (int i = 0; i < arr3D.length; i++) {//each index of 2d array
            for (int j = 0; j <arr3D[i].length ; j++) {//each index number of 1d array
                for (int k = 0; k <arr3D[i][j].length ; k++) {// each index number of the array
                    System.out.print(arr3D[i][j][k] + " ");// returns values



                }

            }

        }
        System.out.println("=====Assignment :  convert the nested loops above to the nested for each loop====");

            for(int[][] each2dArray : arr3D){
                for(int[] each1dArray : each2dArray){
                    for(int eachElement : each1dArray)


                        System.out.print(eachElement + " ");
                    }


                }



             }
         }


          // Assignment :  convert the nested loops above to the nested for each loop

           // conclusion of today's lesson :
          // single dimensional array : contains multiple values
            // int[] a = {1, 2, 3} ;
           // index :     0  1  2

        // retrive :
        /** variableName[indexNum]
         * exp : arr[2] ==>3
         * Array's size is fixed
         *
         * creating array :
         * int[] arr =
         *
         * Multi Dimensional Array : an array that can contains arrays
         * N dimensional array contains {N-1) dimensional arrays
         *
         * EX : 2 dimensional arrays :contains 1 dimensional arrays
         *
         * length of 2D array is determined by the numbers of 1D array
         * int[][] arr2D = { {1,2,3} , {4,5,6} } ;
         *
         * [index num of 1D array]] index num of elements]
         *
         * arr2D[0][1]==> 2
         * arr2D[1] ==> {4,5,6}
         *
         * creating 2D Array:
         * int[][] arr2D = { { 1,2,3} ,{4,5,6}} ;
         * int[][] arr2D = new int [][] { { 1,2,3} ,{4,5,6}} ;
         * int[][] arr2D =  new int [lengthNumber][]
         *
         * 3D Array : contains 2D arrays
         * example :
         * length f the 3D array is determind by the numbers of 2D array
         *
         * int[][][] arr3D = {{{1,2,3},{4,5,6}} , {{7,8},{9}}    };
         *
         * [index num of 2D array][index num of 1D array][index num of each element]
         *
         * retrive: 9
         * arr3D[1][1][0]===>9
         * arr3D[1]==> 2D array : {{7,8},{9}}
         * arr3D[1][0]==> 2D array : {7,8}
         *
         *
         *
         * Arrays util class ;
         *       Arrays.toString(); converts single dimensional array to String, returns it as String
         *
         *       Arrays.deepToString(); converts multi-dimensional array to String,returns it as String
         *
         *       Arrays.sort():
         *
         *
         */


