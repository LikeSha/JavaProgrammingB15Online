package InterviewsCodeKnowledge;

public class RemoveDuplicatesFromAString {

    public static void main(String[] args) {

        // TASK :
        // 1, write a program using while loop, that calculates the sum of the even numbers
        // between 0-20

        // 2, write a program that can reverse a String
        // 3, write a program that can remove duplicates from a String
        //      "aaabbccc"-->>abc

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
