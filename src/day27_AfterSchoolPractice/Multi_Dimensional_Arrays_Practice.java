package day27_AfterSchoolPractice;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

        String[][] names= { {"Rukhshona" , "Ghoya" },{"Hasan" , "Tetiana"}} ;

        // print Hasan
        System.out.println(names[1][0]);

        // print Tetiana
        System.out.println(names[1][1]);

        // change Tetiana to Dilshat
        names[1][1] = "Dilshat" ;
        System.out.println(names[1][1]);

        // print Hasan and dishat
        System.out.println(names[1]);
        System.out.println(Arrays.toString(names[1]));

        // print {     {"Rukhshona" , "Ghoya"} , {"Hasan" , "Tetiana"}     } ;
        System.out.println(Arrays.deepToString(names));

        System.out.println("====================================================");

        int[][] numbers = { {1,2,3} ,{4,5,6} , {7,8,9} , {10,11,12,13}} ;

        System.out.println(Arrays.toString(numbers[0]));

        // I want to print out each and single elements in each arrays
        for (int i = 0; i < numbers.length ; i++) { // checks each index of two dimensional array
            //System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j <numbers[i].length ; j++) {//checks each element of 1D array
                System.out.print(numbers[i][j] + " ");
            }
        }

        System.out.println("===============print out each and every even number=====================================");

        int[][] ages = {{18} , {12,45,14,37,16,17} , {51,20,108,22,23}} ;

        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j] %2 ==1){
                    continue;
                }
                System.out.println("Even number is " + ages[i][j] + " ");
            }



        }



    }
}
