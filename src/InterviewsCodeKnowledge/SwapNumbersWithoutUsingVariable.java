package InterviewsCodeKnowledge;

public class SwapNumbersWithoutUsingVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a+b; // a = 10 + 20 = 30
        b = a-b; // b = 30 - 20 = 10
        a = a-b; // a = 30 -20 =10

        // solution 2:

        a = a^b;
        b = a^b;
        a = a^b;

    }
}
