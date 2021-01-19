package InterviewsCodeKnowledge;
/*
    Task 4: (from Day 2)
    Create a method that will accept a that will accept
    a number (int) and print that many Fibonacci numbers
     */
public class Fibonacci {

    public static void main(String[] args) {

          Fibonacci(15);

    }

    public static void Fibonacci(int num){
        int a = 0;
        int b = 1;
        System.out.println(a + " " + b);

        for (int i = 2; i < num; i++) {
             int next = a + b;
             a = b;// after we have the next number, we want to replace the old number, so at this point,
                   // a is not needed anymore, so to a ,we want to reassign the value that b has! whatever
                   // second number was now we want to store it to the first number
             b = next; // and same thing, the second number we want to replaced by the next number.
            System.out.print(" " + next);
        }
    }
}
