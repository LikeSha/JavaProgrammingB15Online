package InterviewsCodeKnowledge;

public class PalindromeTest {

    public static void main(String[] args) {

        // if you reverse a String it DOES NOT CHANGE
        // it means the string is called Palindrome

        // level , kayak,elle, madam, aziza

        String name = "kayak";

        String reversedName = "";

        for (int i = name.length()-1; i>=0 ; i--) {
            reversedName += name.charAt(i);
        }
        System.out.println("reversedName = " + reversedName);

        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test passed ");
        }else{
            System.out.println("Not Palindrome ");
        }

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

        System.out.println("------------method 2--------------------");

        String str = "abcdcba";
        boolean check = true;

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) !=str.charAt(str.length()-1-i)){
                check = false;
                break;
            }
        }
        System.out.println(check ? "Palindrome" :"Not Palindrome");
        // or if we don't use above ternary statement , we can simply use below 4 lines code:
        /*
        if(check){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
         */


    }

    public static void isPalindrome(int num){
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
