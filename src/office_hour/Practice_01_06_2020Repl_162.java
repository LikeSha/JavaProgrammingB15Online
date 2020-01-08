package office_hour;

public class Practice_01_06_2020Repl_162 {

    public static void main(String[] args) {

        /**
         * Complete a method fib() that will compute Fibonacci numbers
         * Complete a method fib() that will compute Fibonacci numbers
         * In Fibonacci series, next number is the sum of previous two numbers
         * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
         * The first two numbers of the Fibonacci series are 0 and 1.
         * You are given a number num, print n-th Fibonacci Number.
         * Input  : 2
         * Output : 1
         * (Explanation : because number 2 in the sequence of 0, 1 --> 1)
         *
         * Input  : 9
         * Output : 21
         * (Explanation : beacuse number 9 in the sequence of
         *   0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
         *
         *
         *
         * Input  : 2
         * Output : 1
         * (Explanation : beacuse number 2 in the sequence of 0, 1 --> 1)
         *
         * Input  : 9
         * Output : 21
         * (Explanation : beacuse number 9 in the sequence of
         *   0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
         */

       fib(9);

    }
       public static void fib(int num){
           int num1 = 0 ;
           int num2 = 1 ;
           int result = 0 ;
           if(num == 0){
               result = 0 ;
           }
           if (num == 1) {
               result = 1 ;

           }
           for( int i = 2;i <=num ; i++){
               result = num2 + num1 ;
               num1 = num2 ;
               num2 = result ;
           }
           System.out.println(result);

        /*
        Complete a method isPalindrome() that will check if number is a palindrome.
        Print your result as a boolean (true or false).
         Do not convert int into a string!
         Example:
          input: 1001
          output: true

         Example:
         input: 1234
         output: false
        *
         */

           int reversedNumber = 0;
           int originalNumber = num;
           while (num > 0) {
               // 12 % 10 = 2
               // 125 % 10 = 5
               // 3 % 10 = 3
               int last_digit = num % 10;
               // 5 + 4 = 9
               // 5 * 10 + 4 = 54
               // 54 * 10  + 3 = 543
               reversedNumber = reversedNumber * 10 + last_digit;
               //once we retrieved and added last digit to the reversedNumber variable
               //we can get rid off that digit
               // 54 / 10 = 5
               // 1001 / 10 = 100
               // 100 / 10 = 10
               // 10 / 10 = 1
               // 1/10 = 0, according to java
               num = num / 10;
           }
           System.out.println(reversedNumber == originalNumber);
    }

}
