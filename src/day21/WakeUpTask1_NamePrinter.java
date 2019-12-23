package day21;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {

        /**Given your name stored in a variable myName as String
         * for example : String myName = "My name is yourname here ":
         * 1,loop through each and every character print them out like this :
         *  M-->y-->n->a->m->e-> and so on
         *  Put arrow in between the character
         *  I challenge you to use substring for this task
         *
         *  Optionally

         *  2, print the sentence by 2 character at a time
         *  3, print the sentence by 3 character at a time
         *  4, print the sentence by 2 character at a time
         *

         */
//                       012345678901234567890123
        String myName = "My name is Gulay Demirel";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // 01234
        // Hello
        // int x = 0 ;
//        System.out.println( myName.substring(x,x+1)); H
         // ++ x ; 1
//        System.out.println( myName.substring(x,x+1)); e
         // ++ x ; 2
//        System.out.println( myName.substring(x,x+1)); l
        // ++ x ; 3
//        System.out.println( myName.substring(x,x+1)); l
        // ++ x ; 4
//        System.out.println( myName.substring(x,x+1));

        // for hello example : there is two way to represent when do we keep looping
        // if the x value is less than or equal to 4 x<= 4
        // if the x value is less than 5, x<5

       // for (int x = 0; x < charCount ; x++) {
        for (int x = 0; x <= lastCharIndex ; x++) {

           // System.out.println(myName.charAt(x)) + "->");
            System.out.print(myName.substring(x, x+1) + "->" );
        }
        System.out.println("-------------------");
        System.out.println("-----2 char---------");
        // now jump two characters

        // for( int x = 0 ; x < lastCharIndex - 1 ; x++){
        for( int x = 0 ; x < charCount-2 ; x++){

            String twoChar = myName.substring(x, x+2);
            System.out.print(twoChar + "->");
        }

        System.out.println("---------------------------------");
        System.out.println("----3 char ----------------------");
        // now jump 3 characters
        // for( int x = 0 ; x < lastCharIndex-2 ; x++){
        for( int x = 0 ; x < charCount-3 ; x++){

            String threeChar = myName.substring(x, x+3);
            System.out.print(threeChar + "->");
        }

    }
}
           //**While we are going through all characters
          // where do we stop in the loop
//
          //                            4                  5
          // for 1 character -->>     x <= lastcharIndex , x < charCount
          //                            3(x<-=)            4(x<4)
          // for 2 characters -->>    x<= lastCharIndex-1, x < charCount - 1 ,  x <= charCount-2
          //                            2( x <2)            3(x<3)
          // for 3 characters -->>     x<= lastCharIndex-2  x<charCount -2

         // if you are looking for a word with n characters
         // where is my stopping point
         //                             n-1(x
         // for n characters -->>    x<=lastCharIndex-2 , x < charCount- n - 1,  x <=charCount-n
         //               01234567890
         // String abc = "hello world" ; x <= charCount-n ( this is the FORMULAR)
         // I want to get 4 characters at a time
         // WHAT IS MY CONDITION   x <= 11-4
//




