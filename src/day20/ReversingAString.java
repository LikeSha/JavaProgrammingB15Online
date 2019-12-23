package day20;

public class ReversingAString {

    public static void main(String[] args) {

        // THIS IS VERY IMPORTANT , ITS A VERY COMMON INTERVIEW QUESTION

        // Interview questions going deep , they gonna ask you " tell me the String is Palindrome or not ?
        //we will learn this concept in next class " PalindromeTest"

        // given a String variable name with value
        //reverse this name and store reversed value into another String variable reverseName
        //             01234567
        String name = "TONY STARK" ;
        String reversedName = "";

        int lastCharIndex = name.length()-1 ; // REMEMBER THIS FORMULAR !! SUPER IMPORTANT !

        System.out.println();

        for (int x = lastCharIndex; x >=0 ; x--) {

            System.out.print(x + " index : ");

            char currentChar = name.charAt(x);
            System.out.println( name.charAt(x));

            reversedName = reversedName + currentChar;

        }
        System.out.println("reversedName = " + reversedName);
         // This is all we need
        /** for( int x = lastCharIndex ; x >= 0 ; x--){

          reversedName = reversedName + name.charAt( x );
         }

         System.out.println("reversedName = " + reversedName);

         **/
    }
}
 //                   System.out.print(name.charAt(7));
 //                   System.out.print(name.charAt(6));
 //                   System.out.print(name.charAt(5));
 //                   System.out.print(name.charAt(4));
 //                   System.out.print(name.charAt(3));
 //                   System.out.print(name.charAt(2));
 //                   System.out.print(name.charAt(1));
//                    System.out.print(name.charAt(0));