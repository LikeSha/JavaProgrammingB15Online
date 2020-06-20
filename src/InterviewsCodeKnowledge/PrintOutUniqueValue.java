package InterviewsCodeKnowledge;

import day12.SeasonChecker;

public class PrintOutUniqueValue {

    public static void main(String[] args) {

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

        /*1.  Write a program that can print out the unique values from an int Array
        Ex:
        if arr -> {1,1,2,3,3}
        output: 2
        */

        System.out.println("----Task 1----------");

        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5};//expected result : 3
//        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5,6,7,8,9};

        for (int j = 0; j < numbers.length; j++) {

            int count = 0;//find out the number of appearence
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == j) {
                    count++; //adds one to occurence number of 1
                }
            }
            if (count == 1) { // if the value is unique , then we print out
                System.out.println("the unique number of this array : " + j);
            }

        }

        /*
        2. Write a program that can print out the unique values from  String Array
        Ex:
        if arr -> {"a" , "a ", "b", "c", "c"}
        output: b
        */

        System.out.println("-----------task 2--------------------");

        String[] array = {"A","A","B","C","C"}; // expected result : B
//        String[] array = {"A","A","B","C","C","D","E","F"};

        for (int j = 0; j < array.length; j++) {
            int count2 = 0;// to store the number of appeareance

            for (int i = 0; i < array.length; i++) {
                if(array[i].equals(array[j])){
                    ++count2;
                }
            }
            if(count2==1){
                System.out.println("the unique value of this array :" + array[j]);
            }
        }

        /*

         3. Write a program that can find the second max number from an int array
         Ex:
         if arr -> { 1,2,3,4,5}
         output: 4
         DO NOT use sort method
         */

        System.out.println("--------------task 3-----------------");

        int[] grades = {45, 78, 35, 89, 49, 94, 66, 89}; // expected result : 89
        int max = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if(grades[i]>max){
                max=grades[i];
            }
        }
        System.out.println("The max number is " + max);
        /*
        using for each loop to solve this problem
         for (int eachGrade : grades) {
            if (eachGrade > max) {  // use for each loop
                max = eachGrade;
            }
         */

        System.out.println("--------------find out the second max number-------------");
//
       int secondMax = grades[0];

        for (int eachGrade:grades){
            if(eachGrade == max){
                continue;
            }
            if(eachGrade>secondMax){
                secondMax=eachGrade;
            }
        }
        System.out.println("second max number is " + secondMax);

         /*
          Another method to find out second max number :
            for(int eachGrade:grades){
                if(eachGrade>secondMax && eachGrade !=max ){
                    secondMax = eachGrade;
                }
            }
        System.out.println("second max number is "+secondMax);
        */


        /*
         /** 4. Swap two variable' values without using a temporary variable
         Ex:
         if a =10, b= 20;
         output: print( a ) ==> 20
         print( b ) ==> 10
         **/

        int a = 10, b=20;
        a = a + b;   //a = 30 ;
        b = a - b;   // b = 30-20 = 10
        a = a - b;  // a = 30-10 = 20

        System.out.println(a + " " + b);

        // Assignment : write program that can decide two numbers without / operator and
        // remainder operator




    }
}
