package InterviewsCodeKnowledge;
/*
Create a method that will accept a number (long)
and determine if the number of palindrome or not.
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));


    }

    public static boolean isPalindrome(long num){

        long remain = num;//12321 we gonna take one digit each time from this number until it = 0
        long reverse = 0;// I am gonna reverse my number( num is this method param) and put it into a String
                         // first iterator result: 1, second:12 third : 123 forth :1234......

        while(remain != 0){
            long digit = remain % 10 ;// this formula give us the last digit of the number.in this case is 1
            // now I am gonna reverse the number :
            reverse = reverse * 10 + digit; // 0 * 10 --> 0 +1 then 1*10+2 then 12*10+3 then 123*10+2 then 1232*10+1
            remain /= 10;
        }

        return num == reverse;

    }
}
