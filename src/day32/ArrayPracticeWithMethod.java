package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        // this is passing the array object directly into the method
        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});

        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2, 5, 8, 23, 4, 5, 6};

        printArrayItems(scores);

        printMaxOfIntArray(scores);

        printMinofIntArray(scores);

        printSumOfIntArray(scores); // in windows system , click "ctrl" + put mouse on method name ,and
        // it will direct lead you to that entire method

        compare2arraySize(new String[]{"Sezgin", "Senay","Astrit"} , new String[]{"Araz"});
        String[] names1 = {"Superman" , "Batman","Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2arraySize(names1,names2);
    }
    // printArrayItems
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items:-->>> all the items here


    // OPTIONALLY
    // checkScoreAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether all the numbers are more than 60
    // if not print someone has failed


    public static void printArrayItems(int[] nums) {

        System.out.println("array has items " + Arrays.toString(nums));


    }


    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    public static void printMaxOfIntArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max = " + max);

    }
    // printMinofIntArray
    // this method has one int array as a parameter
    // and it will print the min number inside the array

    public static void printMinofIntArray(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("min = " + min);
    }

    // printSumOfIntArray
    //print out each item in this format
    // and it will print the sum number inside the array
    public static void printSumOfIntArray(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum = sum + each;
        }
        System.out.println("sum = " + sum);

    }

    /**
     * compare2arraySize
     * create a method that accept 2 String array object
     * and compare the item counts inside these 2 arrays
     * if arr1 is more than print array 1 has more item
     * if aar2 is more than rint array 2 has more item
     * else print they have same item count
     */
    public static void compare2arraySize(String[] arr1, String[] arr2) {

        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item");
        } else {
            System.out.println("they have same item count");
        }


    }

}

