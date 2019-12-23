package day27_AfterSchoolPractice;

public class Multi_D_ArraysTask {


    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}};
        int max = numbers[0][0]; // assume that first element is the max

        for (int i = 0; i < numbers.length; i++) { // checks each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) { // check each element in the single dimensional array
                if (max < numbers[i][j]) { // compares index 0 of the array with each indexes
                    max = numbers[i][j];  // assigns the maximum number
                    ;
                }
            }
        }
        System.out.println("max = " + max);

        System.out.println("====solution 2===== for each loop to find max ======");

        // solution 2 :
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) { // variable each1DArray represents each single dimensional array
            for( int  eachInt : each1DArray){
                if(max2 < eachInt){
                    max2 = eachInt ;
                }
            }

        }
        System.out.println("max2 = " + max2);

        System.out.println("====find out the minimum number using nested for loop=======");

        // finding the minimum number ;

        int min = numbers[0][0];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if(min> numbers[i][j]){
                    min = numbers[i][j] ;
                }
            }
        }
        System.out.println("min = " + min);


    }

}