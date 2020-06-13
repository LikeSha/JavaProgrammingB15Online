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


    }
}
