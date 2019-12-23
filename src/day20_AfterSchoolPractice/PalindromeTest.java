package day20_AfterSchoolPractice;

public class PalindromeTest {

    public static void main(String[] args) {

        // THIS IS VERY VERY IMPORTANT INTERVIEW QUESTION


        // if you reverse a String if it does not change it means
        // the String is called Palindrome

        // level ,kayak ,elle,madam ,aziza



     String  name = "Kayak" ;//nur sesruN ,this is not same ,because the sequence not equal
        System.out.println("name = " + name);

     String reversedNme = "";

        for (int x = name.length()-1; x >= 0; x--) {

            reversedNme = reversedNme + name.charAt(x);

        }
        System.out.println("reversedNme = " + reversedNme);
         // Check whether reversed name is equal without case checking

        if(name.equalsIgnoreCase((reversedNme))){

            System.out.println("PALINDROME TEST HAS PASSED");

        }else{
            System.out.println("PALINDROME TEST HAS FAILED");
        }




    }
}
