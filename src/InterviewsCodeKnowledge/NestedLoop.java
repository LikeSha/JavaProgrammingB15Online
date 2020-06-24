package InterviewsCodeKnowledge;

import java.util.Arrays;

public class NestedLoop {

    public static void main(String[] args) {

        // count from 1 to 5
        // repeat this 3 times

        for (int i = 1; i <= 3; i++) {// nested loop, write inside loop first , then
            // outside loop ,then put entire inside loop into outside loop
            System.out.println("ITERATION : " + i);

            for (int x = 1; x <= 5; x++) { // this is inside loop print 1-5
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // print each and every element is a two-dimentional array
        System.out.println("print each and every element is a two-dimentional array : ");

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        //                    0         1          2           3

        // I want to print out each and single elements in each arrays
        for (int i = 0; i < numbers.length; i++) { // check each index of two dimensional array
            // System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) { // j checks each elements of single array
                System.out.print(numbers[i][j] + " ");


            }
        }

        // print out each and every even numbers

        System.out.println("print out each and every even numbers : ");

        int[][] ages = {{10}, {12, 13, 14, 15, 16, 17}, {19, 20, 21, 22, 23}};

        for (int i = 0; i < ages.length; i++) {

            for (int j = 0; j < ages[i].length; j++) {
                if (ages[i][j] % 2 != 0) { // if print out odd number : if(ages[i][j] %2 == 0){
                    continue;  // if(ages[i][j] %2 == 0
                }                 //
                System.out.print(ages[i][j] + " "); //  System.out.println(ages[i][j] + " ");

            }
        }

        System.out.println("=============print out 2 dimensional array using for each loop========= ");

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};
        //                   0                   1
        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));
        }

        System.out.println("====print out each and every element in above 2 dimensional array ");

        for (int[] each1DArray : arr2D) {// variable name each1DArray represents each index
            for (int eachElement : each1DArray) {
                System.out.print(eachElement + " ");
            }


        }


    }

}




