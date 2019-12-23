package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line
        //               0123
        // for example : Ayra
        /*
         Ay   substring 0 2
         yr   substring 1 3
         ra   substring 2 4
        */
        String name = "Ayra";
        int lastCharIndex = name.length()-1;

        for(int x = 0 ; x<= lastCharIndex-1; x ++){

            System.out.println( name.substring(x,x+2));


        }
        //               0123
        // for example : Ayra
        /*
         Ayr   substring 0 3
         yra   substring 1 4

       */

        System.out.println("GETTING 3 CHARACTER ");
        for( int x = 0 ; x <= lastCharIndex-2; x ++){

            System.out.println( name.substring( x, x+3));
        }



        }


    }

