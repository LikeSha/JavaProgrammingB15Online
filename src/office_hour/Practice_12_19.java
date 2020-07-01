package office_hour;

import java.util.Arrays;

public class Practice_12_19 {

    public static void main(String[] args) {

        /**1. write a program that can check if a string is build out of the same letters as another string
         Ex: input:
         str1 = "abc";
         str2 = "cba";

         output:
         true

         2. Write a program that will remove all the duplicates from a string
         Do it with Arrays only


         3. given the array of names:
         String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};

         write a program that can remove all the names named Ahmed from the array

         Ex:

         names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
         System.out.println( Arrays.toString(names) );

         output:
         [John, Eric, Hassan]
         *
         */

        // Java Practice : Arrays, Loops

        /**Arrays : a variable that can have multiple data elements
         *        data type[] variable name = {data1, data2,...} // data MUST match with data type
         *        // index :                     0      1
         *
         *
         **/

        int a = 'A';
        int[] arr = {10, (byte) 9, (short) 8, 'a'};
        System.out.println(Arrays.toString(arr));

        long l1 = 100; // implicit : by default 100 is an integer, and we assign it to long data type
        //  int num1 = l1 ; // this is not right ,long > int so you have to manually casting it
        int num1 = (int) l1;

        /**data type[] variable name = {data1, data2,...}
         * variableName[0] ==> data1
         *
         */

        // how can we get the last index number ?
        System.out.println(arr[arr.length - 1]); // data at last index : 97

        // for each loop : is used to access each data in the collection of data (array)
        // It's a loop that's already been iterated . the numbers of execution of the loop
        // depends on the numbers of data elements

        //for(data-type each : ArrayName){

//      }
       // variable "each" represents each elements of the array

        // EX :
       int[] arr2 = {0,0,0} ;
       for(int each : arr2){
           System.out.println(each);// 0 0 0 // gets executed 3 times , because length of array is 3

           /**When do we need for each loop ?
            *
            * when we don't need to use index numbers
            *
            * continue statement : used to skip the current iteration of the loop, and jump to next iteration
            *
            * break statement : exiting the loop
            *
            */
           System.out.println("=============================================");
           for (int i = 0; i < 4 ; i++) {
               if(i==2)
                   continue;

               System.out.print(i);

           }


           System.out.println("================================");
           for (int i = 0; i < 4 ; i++) {
               if(i==2)
                   break; // exits the loop IMMEDIATELY
               System.out.print(i);// 0 1


           }

           //System.out.println(i);// 0 1
       }


        /* /**1. write a program that can check if a string is build out of the same letters as another string
         Ex: input:
         str1 = "abc";
         str2 = "cba";

         output:
         true
        */

        String str1 = "abc", str2 = "cba"; // expected result : true
        // first we need to convert string to array, there are two methods to convert a String to Array:
        //1, split();  , 2, toCharArray();

        char[] arr1 = str1.toCharArray(); // [a,b,c];
        Arrays.sort(arr1); // arr1: [a,b,c];

        char[] arrr2 = str2.toCharArray();// [c,b,b]
        Arrays.sort(arr2);// [b,b,c]

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arrr2));

        // we can use Arrays.equals() to compare to arrays
        System.out.println(Arrays.equals(arr1,arrr2)); // but this is two arrays ,not String ,so we need to
        // convert arrays ( arr1, and arr2) to String then do comparasion.

        // now lets convert arr1 arr2 back to String , by using Arrays.toString();
        str1 =  Arrays.toString(arr1); // str1 got reassigned value
        str2 = Arrays.toString(arrr2); // str2 also got reassigned value

        // now lets compare these two String str1 and str2 ,to see if they are same
        System.out.println(str1.equals(str2));

    }
}
