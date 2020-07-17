package InterviewsCodeKnowledge;

public class ComputeFibonacciNumbers {

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
     * Input  : 8
     * Output : 21
     * (Explanation : because number 8 in the sequence of
     *   0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
     *
     *
     *
     * Input  : 2
     * Output : 1
     * (Explanation : because number 2 in the sequence of 0, 1 --> 1)
     *
     * Input  : 8
     * Output : 21
     * (Explanation : because number 8 in the sequence of
     *   0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
     */

    public static void main(String[] args) {

        fib(8);
    }

    public static void fib(int num){
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        if(num==0){
            result = 0;
        }
        if(num ==1 ){
            result = 1 ;
        }
        for (int i = 2; i <num; i++) {
            result = num2 + num1;
            num1=num2;
            num2=result;
        }
        System.out.println(result);
    }
}
