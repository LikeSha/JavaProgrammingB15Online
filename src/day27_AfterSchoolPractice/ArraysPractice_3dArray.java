package day27_AfterSchoolPractice;

public class ArraysPractice_3dArray {

    public static void main(String[] args) {

        // Print out each and every element in this 3D array
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        for (int i = 0; i < arr3D.length; i++) {// each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) { // eahc index num of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++) { // each index of the values
                    System.out.print(arr3D[i][j][k] + " "); // returns value

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