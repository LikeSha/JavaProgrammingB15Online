package InterviewsCodeKnowledge;

import java.util.Arrays;

public class RemoveDuplicatesFromAString2 {


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

    public static void main(String[] args) {


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

        char[] arr2 = str2.toCharArray();// [c,b,a]
        Arrays.sort(arr2);// [a,b,c]

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // we can use Arrays.equals() to compare two arrays
        System.out.println(Arrays.equals(arr1,arr2)); // but this is two arrays ,not String ,so we need to
        // convert arrays ( arr1, and arr2) to String then do comparasion.

        // now lets convert arr1 arr2 back to String , by using Arrays.toString();
       str1 =  Arrays.toString(arr1); // str1 got reassigned value
       str2 = Arrays.toString(arr2); // str2 also got reassigned value

       // now lets compare these two String str1 and str2 ,to see if they are same
        System.out.println(str1.equals(str2));

       /* TASK 2. Write a program that will remove all the duplicates from a string
        Do it with Arrays only
        */


        // solution 1 : use loop to find out unique
        System.out.println("------solution 1 : use loop to find out unique------");

        String s1 = "aaabbaaccbbdd"; // expected result :abcd
        String s2 = ""; // we store non duplicated characters in it

        for (int i = 0; i < s1.length(); i++) {
            String eachChar = ""+s1.charAt(i);//a--first iteration is a
            if(!s2.contains(eachChar)){
                s2+=eachChar; // we only concat the character if that that character is not exist in s2
                //after first iteration ,since its a ,so we check the condition : if(!s2.contains(eachChar))
                // is true or no, we found , s2 DOES NOT contains a ,so the condition is true ,
                //so the next line of code executed : s2+=eachChar . Now s2 becomes a !
                //then the loop iterated check the second time , second time still a , therefore , the condition of
                //  if(!s2.contains(eachChar) NOT TRUE ITS FALSE ! because first time a already assigned
                // to s2, so s2 already contains a ,so the condition false , the next line of code NOT EXECTUTED
                //which is  s2+=eachChar <<-- this line of code no executed , s2 still has one a
            }

        }

        System.out.println(s2);

        // solution 2 : use Array to find out unique
        System.out.println("------solution 2 : use Array method to find out unique------");

        String fiveMinutes = "abcabcdifjjedyaddc";
        // convert this String to Array , we can use split() method
        fiveMinutes.split("");// returns me String[]===>
        String[] eachChar = fiveMinutes.split("");
//        System.out.println(Arrays.toString(eachChar));
        // to check and each element, we use for each loop, array using for each loop to check !

        String result = ""; // to store all non duplicated String objects of the array
        for(String each : eachChar){
            if(!result.contains(each)){
                result+=each;
            }
        }

        System.out.println(result);

        // use substring method to find out unique

        System.out.println("-------------Solution 3 using substring method to find out unique----------");

        String strstr = "AAABBBDDDEEE"; // expected result ABDE
        String resultUnique = "";//store non duplicates

        for (int i = 0; i < strstr.length(); i++) {
            if(!resultUnique.contains(strstr.substring(i,i+1))){
                resultUnique+=strstr.substring(i,i+1);
            }

        }

        System.out.println("resultUnique = " + resultUnique);


        System.out.println(removeDuplicates("ddjjuuddyydd"));

    }

    // below is System.out.println("--- write a return method that accepts a String and removes duplicate values from the String----");
    public static String removeDuplicates(String str5){
        String resultX = "";
        for (int i = 0; i < str5.length(); i++) {
            if(resultX.contains(str5.substring(i,i+1))){
                resultX+=str5.substring(i,i+1);
            }
        }
        return resultX;
    }
}
