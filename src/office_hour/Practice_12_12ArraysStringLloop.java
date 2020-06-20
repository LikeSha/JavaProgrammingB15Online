package office_hour;

import java.util.Arrays;

public class Practice_12_12ArraysStringLloop {

    public static void main(String[] args) {

        // Array : one of the data structures in java
        /** we need data structure to manage data efficiently , organized manner
         * we can store multiple data into a variable
         *   int  = {10,20} ===>> WRONG
         *
         *   declaration :
         *      data-type [], variableName = {data, data,...}
         *         index :                     0     1   ....
         *
         *  How do I retreave data from array :
         *          variableName[index]
         *            example : int[] arr = {1,2,3}
         *            retrive data :  arr[2]==>> 3
         *  Array is immutable and Array size is fixed ! without initializing array size we can not use it
         *
         *  initializing the size of the array :
         *
         * 1, giving values
         * int[] a = {1,2,3} ; it initialize the size and at the same time
         *                                      // initializes the value
         * 2, giving the size of the array only :
         * int[] a = new int[lengthNumber]
         *
         *
         *
         * default values :
         * byte,short,int,long  == > 0
         * String ==> null
         * double, float ==>0.0
         * boolean ==> false
         *
         * Arrays: presented in java.util package
         * Arrays.toString(VariableName) : converts any data type of Array to String, return String
         * Arrays.sort(VariableName) : sorts the elements within the array in ascending order
         *                             and does not return anything
         *
         *   String class'  split method
         *   str.split("StringValue") : splits the string by given value ,and returns it as string array
         *   example : String[] arr = "ABCD".split(""); ===>> {A,B,C,D}
         *
         *   str.toCharArray() : Assign the String to char array .return char array
         .          */
        int[] arr = {1, 2, 3}; //==>3   Array is immutable and Array size is fixed !
        arr = new int[4];       //Array is immutable and Array size is fixed !
        System.out.println(Arrays.toString(arr));

        int[] arr2;  // ---> this array no size , so you are not allow to use this as array .
        // System.out.println(arr2[0]); // this will give you compile error because no size

        String[] names = new String[5];
        System.out.println(Arrays.toString(names));
        names[2] = "Hasan";
        names[4] = "Parvin";
        System.out.println(Arrays.toString(names));

        int[] nums = new int[7]; // highest index  :6
        //nums[7] = 0 ; // array size is fixed  the output will give you "exception "
        System.out.println(Arrays.toString(nums));

        char[] characters = {'a', 'b', 'c', 'd'};
        Arrays.toString(characters);
        String str1 = Arrays.toString(characters);
        System.out.println(str1);

        int[] scores = {10, 9, 8, 7, 6, 5, 4, 3};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        String[] chars = "ABCD".split("");
        System.out.println(Arrays.toString(chars)); // [A,B,C,D]

        //str.toCharArray() : Assign the String to char array .return char array
        char[] chars2 = "vald".toCharArray();
        System.out.println(chars2);


        System.out.println("=======BELOW ARE THE TASKS= task 1=======");

        /**Task:
         1.  Write a program that can print out the unique values from an int Array
         Ex:
         if arr -> {1,1,2,3,3}
         output: 2
         2. Write a program that can print out the unique values from  String Array
         Ex:
         if arr -> {"a" , "a ", "b", "c", "c"}
         output: b
         3. Write a program that can find the second max number from an int array
         Ex:
         if arr -> { 1,2,3,4,5}
         output: 4
         DO NOT use sort method
         4. Swap two variable' values without using a temporary variable
         Ex:
         if a =10, b= 20;
         output: print( a ) ==> 20
         print( b ) ==> 10

         */
        // task 1 :Write a program that can print out the unique values from an int Array
        //         Ex:
        //         if arr -> {1,1,2,3,3}


        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9}; // expected result : 3,6,7,8,9

        for (int j = 0; j < numbers.length; j++) {

            int count = 0;// find out the number of apperence
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    count++;// adds one to occurence number of 1
                }

            }
            if (count == 1) { // if the value is unique , then we print out
                System.out.println(numbers[j]);
            }


        }
        System.out.println("=================task 2==================");
        // task 2  //task 2 Write a program that can print out the unique values from  String Array
        //        //         Ex:
        //        //         if arr -> {"a" , "a ", "b", "c", "c"}
        //        //         output: b

        String[] array = {"a", "a", "b", "c", "c", "d", "e"}; // expected result : b d e
        for (int j = 0; j < array.length; j++) {
            int count2 = 0; // to store the number of accurence
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(array[j])) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(array[j]);
            }
        }
        System.out.println("===============task 3=======================");
        // 3. Write a program that can find the second max number from an int array
        //         Ex:
        //         if arr -> { 1,2,3,4,5}
        //         output: 4
        //         DO NOT use sort method

        int[] grades = {1, 2, 3, 4, 5, 6, 7, 8}; // expected result : 7

        int max = grades[0];

        for (int eachGrade : grades) {
            if (eachGrade > max) {  // use for each loop
                max = eachGrade;
            }


        }
        System.out.println(max);

        int secondMax = grades[0];
        for (int eachGrade : grades) {
            if (eachGrade == max) {
                continue;
            }
            if (eachGrade > secondMax) {
                secondMax = eachGrade;
            }

        }

        System.out.println("second Max number  = " + secondMax);

        System.out.println("============task 4===================");

        /** 4. Swap two variable' values without using a temporary variable
         Ex:
         if a =10, b= 20;
         output: print( a ) ==> 20
         print( b ) ==> 10
         **/
        int a = 10, b = 20;
        // expected result : a=20, b=10 ;
      /*  int c= a ; // c=10 ;
        a=b; // a= 20 ;
        b = c ;  // b=c

        System.out.println(a + " " + b);
       */
        a = a + b;   //a = 30 ;
        b = a - b;   // b = 30-20 = 10
        a = a - b;  // a = 30-10 = 20

        System.out.println(a + " " + b);

        // Assignment : write program that can decide two numbers without / operator and
        // remainder operator




            }


        }


















/**
 * a=9 , b=3 ..
 * a=a+b.. //12
 * b=a-b.. //12-3=9
 * a=a-b..//12-9=3..
 * sout(a) = 3
 * sout(b)=9
 *
 */






