package office_hour;

import java.util.Arrays;

public class Practice_12_19_Task {

    public static void main(String[] args) {

        /**1. write a program that can check if a string is build out of the same letters as another string
         Ex: input:
         str1 = "abc";
         str2 = "cba";

         output:
         true
         2. Write a program that will remove all the duplicated characters from a string
         Do it withg Arrays only


         3. given the array of names:
         String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};

         write a program that can remove all the names named Ahmed from the array

         Ex:

         names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
         System.out.println( Arrays.toString(names) );

         output:
         [John, Eric, Hassan]
         *
         *
         */

        System.out.println("=========task 1====================");

      /**  1. write a program that can check if a string is build out of the same letters as another string
        Ex: input:
        str1 = "abc";
        str2 = "cba";

        output:
        true
         **/
         String  str1 = "abc" , str2 = "cba" ; // expected result :false

        // split() , toCharArray(), this two method can create an array to a string

        char[] ar1 = str1.toCharArray() ; // a, b, c
        Arrays.sort(ar1); // arr1 : [a,b,c]

        char[] ar2 = str2.toCharArray(); // [c ,b,b]
        Arrays.sort(ar2); // [b,b,c]

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        //System.out.println(Arrays.equals(ar1.ar2)); this is compare with 2 arrays .

        str1 =Arrays.toString(ar1) ;
        str2 = Arrays.toString(ar2);

        System.out.println(str1.equals(str2)); // true


        System.out.println("===========task 2========================");

        // 2. Write a program that will remove all the duplicated characters from a string
        //         Do it with Arrays only

        String s1 = "aaabbaaccbbdd" ; // expected result : abcd
        String s2 = ""; // we have this string variable because we store non duplicated characters in it

        for (int i = 0; i < s1.length() ; i++) {
            String eachChar = "" + s1.charAt(i); // a

           if(!s2.contains(eachChar))
            s2 += eachChar ; // we only concatenate the character if that character is not exist in s2
        }
        System.out.println(s2);

        System.out.println("===task 2 solution 2===========");

        String fiveMinutes = "abcabcdeedddeeefffffjjjj" ;
        String[] EachChar = fiveMinutes.split("");//[a,a,a,c,d,...] after split empty string like that
        String result = "" ; // to store all non duplicated String objects of the array

        for(String each : EachChar){
            if(!result.contains(each)){
                result += each ;
            }
        }

        System.out.println(result);

    }
}
