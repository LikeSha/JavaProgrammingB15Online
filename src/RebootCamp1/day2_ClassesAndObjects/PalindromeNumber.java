package RebootCamp1.day2_ClassesAndObjects;

// Create a method that will accept a number (long) and determine if the number of
//palindrome or not
public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));

    }

    public static boolean isPalindrome(long num){

        long remain = num;// 12321
        long rev = 0 ; //

        while(remain !=0) {

            long digit = remain % 10;//1

            rev = rev * 10 + digit;// 0 * 10--> 0 + 1

            remain /= 10;
        }
        return num == rev;

    }


}


