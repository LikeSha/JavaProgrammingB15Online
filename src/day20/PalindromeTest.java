package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        // THIS IS VERY VERY IMPORTANT INTERVIEW QUESTION


        // if you reverse a String if it does not change it means
        // the String is called Palindrome

        // level ,kayak ,elle,madam ,aziza


        String name = "Nurses run"; // nur sesruN
        System.out.println("name = " + name);

        String reversedName = "";

        for (int x = name.length()-1; x >=0 ; x--) {
            reversedName = reversedName + name.charAt(x) ;

        }

        System.out.println("reversedName = " + reversedName);

        // HOMEWORK : MAKE THIS CODE DOES NOT CARE ABOUT SPACES WHILE CHECKING

        // Check whether revered name is equal without case checking
        if(name.equalsIgnoreCase( reversedName)){

            System.out.println("PALINDROME TEST HAS PASSED");
        }else{
            System.out.println("PALINDROME TEST HAS FAILED");
        }











    }
}
